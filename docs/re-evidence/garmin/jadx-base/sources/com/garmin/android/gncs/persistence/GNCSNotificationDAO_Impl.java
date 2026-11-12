package com.garmin.android.gncs.persistence;

import android.database.Cursor;
import androidx.room.b0;
import androidx.room.f;
import androidx.room.h;
import androidx.room.l0;
import androidx.room.q0;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import gl1.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import md.a;
import vd.g;

/* JADX INFO: loaded from: classes11.dex */
public final class GNCSNotificationDAO_Impl implements GNCSNotificationDAO {
    private final b0 __db;
    private final f<GNCSNotificationInfo> __deletionAdapterOfGNCSNotificationInfo;
    private final GNCSConverters __gNCSConverters = new GNCSConverters();
    private final h<GNCSNotificationInfo> __insertionAdapterOfGNCSNotificationInfo;
    private final q0 __preparedStmtOfDeleteNotifsByPackageName;
    private final q0 __preparedStmtOfRemoveNotifications;
    private final q0 __preparedStmtOfRemoveStaleNotifications;

    public GNCSNotificationDAO_Impl(b0 b0Var) {
        this.__db = b0Var;
        this.__insertionAdapterOfGNCSNotificationInfo = new h<GNCSNotificationInfo>(b0Var) { // from class: com.garmin.android.gncs.persistence.GNCSNotificationDAO_Impl.1
            @Override // androidx.room.h
            public void bind(g gVar, GNCSNotificationInfo gNCSNotificationInfo) {
                String notificationStatus = GNCSNotificationDAO_Impl.this.__gNCSConverters.toNotificationStatus(gNCSNotificationInfo.status);
                if (notificationStatus == null) {
                    gVar.u(1);
                } else {
                    gVar.r(1, notificationStatus);
                }
                gVar.h(2, gNCSNotificationInfo.statusTimestamp);
                String str = gNCSNotificationInfo.title;
                if (str == null) {
                    gVar.u(3);
                } else {
                    gVar.r(3, str);
                }
                String str2 = gNCSNotificationInfo.subTitle;
                if (str2 == null) {
                    gVar.u(4);
                } else {
                    gVar.r(4, str2);
                }
                String str3 = gNCSNotificationInfo.message;
                if (str3 == null) {
                    gVar.u(5);
                } else {
                    gVar.r(5, str3);
                }
                String str4 = gNCSNotificationInfo.positiveAction;
                if (str4 == null) {
                    gVar.u(6);
                } else {
                    gVar.r(6, str4);
                }
                String str5 = gNCSNotificationInfo.negativeAction;
                if (str5 == null) {
                    gVar.u(7);
                } else {
                    gVar.r(7, str5);
                }
                String str6 = gNCSNotificationInfo.phoneNumber;
                if (str6 == null) {
                    gVar.u(8);
                } else {
                    gVar.r(8, str6);
                }
                String str7 = gNCSNotificationInfo.cacheKey;
                if (str7 == null) {
                    gVar.u(9);
                } else {
                    gVar.r(9, str7);
                }
                gVar.h(10, gNCSNotificationInfo.cacheId);
                String str8 = gNCSNotificationInfo.notificationKey;
                if (str8 == null) {
                    gVar.u(11);
                } else {
                    gVar.r(11, str8);
                }
                String str9 = gNCSNotificationInfo.packageName;
                if (str9 == null) {
                    gVar.u(12);
                } else {
                    gVar.r(12, str9);
                }
                String str10 = gNCSNotificationInfo.groupKey;
                if (str10 == null) {
                    gVar.u(13);
                } else {
                    gVar.r(13, str10);
                }
                String notificationType = GNCSNotificationDAO_Impl.this.__gNCSConverters.toNotificationType(gNCSNotificationInfo.type);
                if (notificationType == null) {
                    gVar.u(14);
                } else {
                    gVar.r(14, notificationType);
                }
                gVar.h(15, gNCSNotificationInfo.postTime);
                gVar.h(16, gNCSNotificationInfo.when);
                gVar.h(17, gNCSNotificationInfo.positiveActionIndex);
                gVar.h(18, gNCSNotificationInfo.negativeActionIndex);
                gVar.h(19, gNCSNotificationInfo.notificationFlags);
                gVar.h(20, gNCSNotificationInfo.eventFlags);
                gVar.h(21, gNCSNotificationInfo.extraFlags);
                String str11 = gNCSNotificationInfo.category;
                if (str11 == null) {
                    gVar.u(22);
                } else {
                    gVar.r(22, str11);
                }
                gVar.h(23, gNCSNotificationInfo.priority);
                gVar.h(24, gNCSNotificationInfo.numEvents);
                gVar.h(25, gNCSNotificationInfo.isProgressUpdate);
                gVar.h(26, GNCSNotificationDAO_Impl.this.__gNCSConverters.hasLargeIconToInt(gNCSNotificationInfo.hasLargeIcon));
                String str12 = gNCSNotificationInfo.conversationId;
                if (str12 == null) {
                    gVar.u(27);
                } else {
                    gVar.r(27, str12);
                }
                gVar.h(28, GNCSNotificationDAO_Impl.this.__gNCSConverters.hasLargeIconToInt(gNCSNotificationInfo.isSuppressed));
                gVar.h(29, gNCSNotificationInfo.numRemoteViewImages);
                String strActionsToString = GNCSNotificationDAO_Impl.this.__gNCSConverters.actionsToString(gNCSNotificationInfo.actions);
                if (strActionsToString == null) {
                    gVar.u(30);
                } else {
                    gVar.r(30, strActionsToString);
                }
                String strImagesToString = GNCSNotificationDAO_Impl.this.__gNCSConverters.imagesToString(gNCSNotificationInfo.images);
                if (strImagesToString == null) {
                    gVar.u(31);
                } else {
                    gVar.r(31, strImagesToString);
                }
                gVar.h(32, gNCSNotificationInfo.callType);
            }

            @Override // androidx.room.q0
            public String createQuery() {
                return "INSERT OR REPLACE INTO `notification_info` (`status`,`statusTimestamp`,`title`,`subTitle`,`message`,`positiveAction`,`negativeAction`,`phoneNumber`,`cacheKey`,`cacheId`,`notificationKey`,`packageName`,`groupKey`,`type`,`postTime`,`when`,`positiveActionIndex`,`negativeActionIndex`,`notificationFlags`,`eventFlags`,`extraFlags`,`category`,`priority`,`numEvents`,`isProgressUpdate`,`hasLargeIcon`,`conversationId`,`isSuppressed`,`numRemoteViewImages`,`actions`,`images`,`callType`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__deletionAdapterOfGNCSNotificationInfo = new f<GNCSNotificationInfo>(b0Var) { // from class: com.garmin.android.gncs.persistence.GNCSNotificationDAO_Impl.2
            @Override // androidx.room.f
            public void bind(g gVar, GNCSNotificationInfo gNCSNotificationInfo) {
                String str = gNCSNotificationInfo.cacheKey;
                if (str == null) {
                    gVar.u(1);
                } else {
                    gVar.r(1, str);
                }
            }

            @Override // androidx.room.f, androidx.room.q0
            public String createQuery() {
                return "DELETE FROM `notification_info` WHERE `cacheKey` = ?";
            }
        };
        this.__preparedStmtOfDeleteNotifsByPackageName = new q0(b0Var) { // from class: com.garmin.android.gncs.persistence.GNCSNotificationDAO_Impl.3
            @Override // androidx.room.q0
            public String createQuery() {
                return "DELETE FROM notification_info WHERE packageName = ?";
            }
        };
        this.__preparedStmtOfRemoveNotifications = new q0(b0Var) { // from class: com.garmin.android.gncs.persistence.GNCSNotificationDAO_Impl.4
            @Override // androidx.room.q0
            public String createQuery() {
                return "DELETE FROM notification_info WHERE type = ?";
            }
        };
        this.__preparedStmtOfRemoveStaleNotifications = new q0(b0Var) { // from class: com.garmin.android.gncs.persistence.GNCSNotificationDAO_Impl.5
            @Override // androidx.room.q0
            public String createQuery() {
                return "DELETE FROM notification_info WHERE status IN ('REMOVED', 'DNS') AND statusTimestamp < ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public void deleteNotifsByPackageName(String str) {
        this.__db.assertNotSuspendingTransaction();
        g gVarAcquire = this.__preparedStmtOfDeleteNotifsByPackageName.acquire();
        if (str == null) {
            gVarAcquire.u(1);
        } else {
            gVarAcquire.r(1, str);
        }
        this.__db.beginTransaction();
        try {
            gVarAcquire.b2();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteNotifsByPackageName.release(gVarAcquire);
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public List<GNCSNotificationInfo> getActiveNotifications(GNCSNotificationInfo.NotificationType notificationType) throws Throwable {
        l0 l0Var;
        GNCSNotificationDAO_Impl gNCSNotificationDAO_Impl = this;
        l0 l0VarE = l0.e(1, "SELECT * FROM notification_info WHERE type = ? AND status IN ('NEW', 'NEW_SILENT', 'UPDATED')");
        String notificationType2 = gNCSNotificationDAO_Impl.__gNCSConverters.toNotificationType(notificationType);
        if (notificationType2 == null) {
            l0VarE.u(1);
        } else {
            l0VarE.r(1, notificationType2);
        }
        gNCSNotificationDAO_Impl.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(gNCSNotificationDAO_Impl.__db, l0VarE);
        try {
            int iA = a.a(cursorR, "status");
            int iA2 = a.a(cursorR, "statusTimestamp");
            int iA3 = a.a(cursorR, "title");
            int iA4 = a.a(cursorR, "subTitle");
            int iA5 = a.a(cursorR, "message");
            int iA6 = a.a(cursorR, "positiveAction");
            int iA7 = a.a(cursorR, "negativeAction");
            int iA8 = a.a(cursorR, "phoneNumber");
            int iA9 = a.a(cursorR, "cacheKey");
            int iA10 = a.a(cursorR, "cacheId");
            int iA11 = a.a(cursorR, "notificationKey");
            int iA12 = a.a(cursorR, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            int iA13 = a.a(cursorR, "groupKey");
            l0Var = l0VarE;
            try {
                int iA14 = a.a(cursorR, NotificationConstants.KEY_DATA_MIME_TYPE);
                int iA15 = a.a(cursorR, "postTime");
                int iA16 = a.a(cursorR, "when");
                int iA17 = a.a(cursorR, "positiveActionIndex");
                int iA18 = a.a(cursorR, "negativeActionIndex");
                int iA19 = a.a(cursorR, "notificationFlags");
                int iA20 = a.a(cursorR, "eventFlags");
                int iA21 = a.a(cursorR, "extraFlags");
                int iA22 = a.a(cursorR, "category");
                int iA23 = a.a(cursorR, "priority");
                int iA24 = a.a(cursorR, "numEvents");
                int iA25 = a.a(cursorR, "isProgressUpdate");
                int iA26 = a.a(cursorR, "hasLargeIcon");
                int iA27 = a.a(cursorR, "conversationId");
                int iA28 = a.a(cursorR, "isSuppressed");
                int iA29 = a.a(cursorR, "numRemoteViewImages");
                int iA30 = a.a(cursorR, "actions");
                int iA31 = a.a(cursorR, "images");
                int iA32 = a.a(cursorR, "callType");
                int i14 = iA13;
                ArrayList arrayList = new ArrayList(cursorR.getCount());
                while (cursorR.moveToNext()) {
                    GNCSNotificationInfo gNCSNotificationInfo = new GNCSNotificationInfo();
                    ArrayList arrayList2 = arrayList;
                    int i15 = iA;
                    gNCSNotificationInfo.status = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationStatusValue(cursorR.isNull(iA) ? null : cursorR.getString(iA));
                    try {
                        gNCSNotificationInfo.statusTimestamp = cursorR.getLong(iA2);
                        if (cursorR.isNull(iA3)) {
                            gNCSNotificationInfo.title = null;
                        } else {
                            gNCSNotificationInfo.title = cursorR.getString(iA3);
                        }
                        if (cursorR.isNull(iA4)) {
                            gNCSNotificationInfo.subTitle = null;
                        } else {
                            gNCSNotificationInfo.subTitle = cursorR.getString(iA4);
                        }
                        if (cursorR.isNull(iA5)) {
                            gNCSNotificationInfo.message = null;
                        } else {
                            gNCSNotificationInfo.message = cursorR.getString(iA5);
                        }
                        if (cursorR.isNull(iA6)) {
                            gNCSNotificationInfo.positiveAction = null;
                        } else {
                            gNCSNotificationInfo.positiveAction = cursorR.getString(iA6);
                        }
                        if (cursorR.isNull(iA7)) {
                            gNCSNotificationInfo.negativeAction = null;
                        } else {
                            gNCSNotificationInfo.negativeAction = cursorR.getString(iA7);
                        }
                        if (cursorR.isNull(iA8)) {
                            gNCSNotificationInfo.phoneNumber = null;
                        } else {
                            gNCSNotificationInfo.phoneNumber = cursorR.getString(iA8);
                        }
                        if (cursorR.isNull(iA9)) {
                            gNCSNotificationInfo.cacheKey = null;
                        } else {
                            gNCSNotificationInfo.cacheKey = cursorR.getString(iA9);
                        }
                        gNCSNotificationInfo.cacheId = cursorR.getLong(iA10);
                        if (cursorR.isNull(iA11)) {
                            gNCSNotificationInfo.notificationKey = null;
                        } else {
                            gNCSNotificationInfo.notificationKey = cursorR.getString(iA11);
                        }
                        if (cursorR.isNull(iA12)) {
                            gNCSNotificationInfo.packageName = null;
                        } else {
                            gNCSNotificationInfo.packageName = cursorR.getString(iA12);
                        }
                        int i16 = i14;
                        if (cursorR.isNull(i16)) {
                            gNCSNotificationInfo.groupKey = null;
                        } else {
                            gNCSNotificationInfo.groupKey = cursorR.getString(i16);
                        }
                        int i17 = iA14;
                        String string = cursorR.isNull(i17) ? null : cursorR.getString(i17);
                        i14 = i16;
                        iA14 = i17;
                        gNCSNotificationDAO_Impl = this;
                        gNCSNotificationInfo.type = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationTypeValue(string);
                        int i18 = iA2;
                        int i19 = iA15;
                        int i24 = iA3;
                        gNCSNotificationInfo.postTime = cursorR.getLong(i19);
                        int i25 = iA16;
                        int i26 = iA4;
                        gNCSNotificationInfo.when = cursorR.getLong(i25);
                        int i27 = iA17;
                        gNCSNotificationInfo.positiveActionIndex = cursorR.getInt(i27);
                        int i28 = iA18;
                        gNCSNotificationInfo.negativeActionIndex = cursorR.getInt(i28);
                        int i29 = iA19;
                        gNCSNotificationInfo.notificationFlags = cursorR.getInt(i29);
                        iA19 = i29;
                        int i30 = iA20;
                        gNCSNotificationInfo.eventFlags = cursorR.getInt(i30);
                        iA20 = i30;
                        iA21 = iA21;
                        gNCSNotificationInfo.extraFlags = cursorR.getInt(iA21);
                        int i34 = iA22;
                        if (cursorR.isNull(i34)) {
                            gNCSNotificationInfo.category = null;
                        } else {
                            gNCSNotificationInfo.category = cursorR.getString(i34);
                        }
                        iA22 = i34;
                        int i35 = iA23;
                        gNCSNotificationInfo.priority = cursorR.getInt(i35);
                        iA23 = i35;
                        int i36 = iA24;
                        gNCSNotificationInfo.numEvents = cursorR.getInt(i36);
                        iA24 = i36;
                        int i37 = iA25;
                        gNCSNotificationInfo.isProgressUpdate = cursorR.getInt(i37);
                        iA25 = i37;
                        int i38 = iA26;
                        iA26 = i38;
                        gNCSNotificationInfo.hasLargeIcon = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i38));
                        int i39 = iA27;
                        if (cursorR.isNull(i39)) {
                            gNCSNotificationInfo.conversationId = null;
                        } else {
                            gNCSNotificationInfo.conversationId = cursorR.getString(i39);
                        }
                        iA27 = i39;
                        int i44 = iA28;
                        iA28 = i44;
                        gNCSNotificationInfo.isSuppressed = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i44));
                        int i45 = iA29;
                        gNCSNotificationInfo.numRemoteViewImages = cursorR.getInt(i45);
                        int i46 = iA30;
                        gNCSNotificationInfo.actions = gNCSNotificationDAO_Impl.__gNCSConverters.stringToActions(cursorR.isNull(i46) ? null : cursorR.getString(i46));
                        int i47 = iA31;
                        iA31 = i47;
                        gNCSNotificationInfo.images = gNCSNotificationDAO_Impl.__gNCSConverters.stringToImages(cursorR.isNull(i47) ? null : cursorR.getString(i47));
                        int i48 = iA32;
                        gNCSNotificationInfo.callType = cursorR.getInt(i48);
                        arrayList = arrayList2;
                        arrayList.add(gNCSNotificationInfo);
                        iA16 = i25;
                        iA2 = i18;
                        iA18 = i28;
                        iA4 = i26;
                        iA17 = i27;
                        iA3 = i24;
                        iA15 = i19;
                        iA30 = i46;
                        iA29 = i45;
                        iA32 = i48;
                        iA = i15;
                    } catch (Throwable th3) {
                        th = th3;
                        cursorR.close();
                        l0Var.release();
                        throw th;
                    }
                }
                cursorR.close();
                l0Var.release();
                return arrayList;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            l0Var = l0VarE;
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public List<GNCSNotificationInfo> getActiveNotificationsOfCategory(String str) throws Throwable {
        l0 l0Var;
        GNCSNotificationDAO_Impl gNCSNotificationDAO_Impl = this;
        l0 l0VarE = l0.e(1, "SELECT * FROM notification_info WHERE category = ? AND status IN ('NEW', 'NEW_SILENT', 'UPDATED')");
        if (str == null) {
            l0VarE.u(1);
        } else {
            l0VarE.r(1, str);
        }
        gNCSNotificationDAO_Impl.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(gNCSNotificationDAO_Impl.__db, l0VarE);
        try {
            int iA = a.a(cursorR, "status");
            int iA2 = a.a(cursorR, "statusTimestamp");
            int iA3 = a.a(cursorR, "title");
            int iA4 = a.a(cursorR, "subTitle");
            int iA5 = a.a(cursorR, "message");
            int iA6 = a.a(cursorR, "positiveAction");
            int iA7 = a.a(cursorR, "negativeAction");
            int iA8 = a.a(cursorR, "phoneNumber");
            int iA9 = a.a(cursorR, "cacheKey");
            int iA10 = a.a(cursorR, "cacheId");
            int iA11 = a.a(cursorR, "notificationKey");
            int iA12 = a.a(cursorR, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            int iA13 = a.a(cursorR, "groupKey");
            l0Var = l0VarE;
            try {
                int iA14 = a.a(cursorR, NotificationConstants.KEY_DATA_MIME_TYPE);
                int iA15 = a.a(cursorR, "postTime");
                int iA16 = a.a(cursorR, "when");
                int iA17 = a.a(cursorR, "positiveActionIndex");
                int iA18 = a.a(cursorR, "negativeActionIndex");
                int iA19 = a.a(cursorR, "notificationFlags");
                int iA20 = a.a(cursorR, "eventFlags");
                int iA21 = a.a(cursorR, "extraFlags");
                int iA22 = a.a(cursorR, "category");
                int iA23 = a.a(cursorR, "priority");
                int iA24 = a.a(cursorR, "numEvents");
                int iA25 = a.a(cursorR, "isProgressUpdate");
                int iA26 = a.a(cursorR, "hasLargeIcon");
                int iA27 = a.a(cursorR, "conversationId");
                int iA28 = a.a(cursorR, "isSuppressed");
                int iA29 = a.a(cursorR, "numRemoteViewImages");
                int iA30 = a.a(cursorR, "actions");
                int iA31 = a.a(cursorR, "images");
                int iA32 = a.a(cursorR, "callType");
                int i14 = iA13;
                ArrayList arrayList = new ArrayList(cursorR.getCount());
                while (cursorR.moveToNext()) {
                    GNCSNotificationInfo gNCSNotificationInfo = new GNCSNotificationInfo();
                    ArrayList arrayList2 = arrayList;
                    int i15 = iA;
                    gNCSNotificationInfo.status = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationStatusValue(cursorR.isNull(iA) ? null : cursorR.getString(iA));
                    try {
                        gNCSNotificationInfo.statusTimestamp = cursorR.getLong(iA2);
                        if (cursorR.isNull(iA3)) {
                            gNCSNotificationInfo.title = null;
                        } else {
                            gNCSNotificationInfo.title = cursorR.getString(iA3);
                        }
                        if (cursorR.isNull(iA4)) {
                            gNCSNotificationInfo.subTitle = null;
                        } else {
                            gNCSNotificationInfo.subTitle = cursorR.getString(iA4);
                        }
                        if (cursorR.isNull(iA5)) {
                            gNCSNotificationInfo.message = null;
                        } else {
                            gNCSNotificationInfo.message = cursorR.getString(iA5);
                        }
                        if (cursorR.isNull(iA6)) {
                            gNCSNotificationInfo.positiveAction = null;
                        } else {
                            gNCSNotificationInfo.positiveAction = cursorR.getString(iA6);
                        }
                        if (cursorR.isNull(iA7)) {
                            gNCSNotificationInfo.negativeAction = null;
                        } else {
                            gNCSNotificationInfo.negativeAction = cursorR.getString(iA7);
                        }
                        if (cursorR.isNull(iA8)) {
                            gNCSNotificationInfo.phoneNumber = null;
                        } else {
                            gNCSNotificationInfo.phoneNumber = cursorR.getString(iA8);
                        }
                        if (cursorR.isNull(iA9)) {
                            gNCSNotificationInfo.cacheKey = null;
                        } else {
                            gNCSNotificationInfo.cacheKey = cursorR.getString(iA9);
                        }
                        gNCSNotificationInfo.cacheId = cursorR.getLong(iA10);
                        if (cursorR.isNull(iA11)) {
                            gNCSNotificationInfo.notificationKey = null;
                        } else {
                            gNCSNotificationInfo.notificationKey = cursorR.getString(iA11);
                        }
                        if (cursorR.isNull(iA12)) {
                            gNCSNotificationInfo.packageName = null;
                        } else {
                            gNCSNotificationInfo.packageName = cursorR.getString(iA12);
                        }
                        int i16 = i14;
                        if (cursorR.isNull(i16)) {
                            gNCSNotificationInfo.groupKey = null;
                        } else {
                            gNCSNotificationInfo.groupKey = cursorR.getString(i16);
                        }
                        int i17 = iA14;
                        String string = cursorR.isNull(i17) ? null : cursorR.getString(i17);
                        i14 = i16;
                        iA14 = i17;
                        gNCSNotificationDAO_Impl = this;
                        gNCSNotificationInfo.type = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationTypeValue(string);
                        int i18 = iA15;
                        int i19 = iA2;
                        gNCSNotificationInfo.postTime = cursorR.getLong(i18);
                        int i24 = iA16;
                        int i25 = iA3;
                        gNCSNotificationInfo.when = cursorR.getLong(i24);
                        int i26 = iA17;
                        gNCSNotificationInfo.positiveActionIndex = cursorR.getInt(i26);
                        int i27 = iA18;
                        gNCSNotificationInfo.negativeActionIndex = cursorR.getInt(i27);
                        int i28 = iA19;
                        gNCSNotificationInfo.notificationFlags = cursorR.getInt(i28);
                        iA19 = i28;
                        int i29 = iA20;
                        gNCSNotificationInfo.eventFlags = cursorR.getInt(i29);
                        iA20 = i29;
                        iA21 = iA21;
                        gNCSNotificationInfo.extraFlags = cursorR.getInt(iA21);
                        int i30 = iA22;
                        if (cursorR.isNull(i30)) {
                            gNCSNotificationInfo.category = null;
                        } else {
                            gNCSNotificationInfo.category = cursorR.getString(i30);
                        }
                        iA22 = i30;
                        int i34 = iA23;
                        gNCSNotificationInfo.priority = cursorR.getInt(i34);
                        iA23 = i34;
                        int i35 = iA24;
                        gNCSNotificationInfo.numEvents = cursorR.getInt(i35);
                        iA24 = i35;
                        int i36 = iA25;
                        gNCSNotificationInfo.isProgressUpdate = cursorR.getInt(i36);
                        iA25 = i36;
                        int i37 = iA26;
                        iA26 = i37;
                        gNCSNotificationInfo.hasLargeIcon = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i37));
                        int i38 = iA27;
                        if (cursorR.isNull(i38)) {
                            gNCSNotificationInfo.conversationId = null;
                        } else {
                            gNCSNotificationInfo.conversationId = cursorR.getString(i38);
                        }
                        iA27 = i38;
                        int i39 = iA28;
                        iA28 = i39;
                        gNCSNotificationInfo.isSuppressed = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i39));
                        int i44 = iA29;
                        gNCSNotificationInfo.numRemoteViewImages = cursorR.getInt(i44);
                        int i45 = iA30;
                        gNCSNotificationInfo.actions = gNCSNotificationDAO_Impl.__gNCSConverters.stringToActions(cursorR.isNull(i45) ? null : cursorR.getString(i45));
                        int i46 = iA31;
                        iA31 = i46;
                        gNCSNotificationInfo.images = gNCSNotificationDAO_Impl.__gNCSConverters.stringToImages(cursorR.isNull(i46) ? null : cursorR.getString(i46));
                        int i47 = iA32;
                        gNCSNotificationInfo.callType = cursorR.getInt(i47);
                        arrayList = arrayList2;
                        arrayList.add(gNCSNotificationInfo);
                        iA17 = i26;
                        iA2 = i19;
                        iA15 = i18;
                        iA18 = i27;
                        iA3 = i25;
                        iA16 = i24;
                        iA30 = i45;
                        iA29 = i44;
                        iA32 = i47;
                        iA = i15;
                    } catch (Throwable th3) {
                        th = th3;
                        cursorR.close();
                        l0Var.release();
                        throw th;
                    }
                }
                cursorR.close();
                l0Var.release();
                return arrayList;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            l0Var = l0VarE;
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public List<GNCSNotificationInfo> getAllNotifications() throws Throwable {
        l0 l0Var;
        GNCSNotificationDAO_Impl gNCSNotificationDAO_Impl = this;
        l0 l0VarE = l0.e(0, "SELECT * FROM notification_info ORDER BY `when`");
        gNCSNotificationDAO_Impl.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(gNCSNotificationDAO_Impl.__db, l0VarE);
        try {
            int iA = a.a(cursorR, "status");
            int iA2 = a.a(cursorR, "statusTimestamp");
            int iA3 = a.a(cursorR, "title");
            int iA4 = a.a(cursorR, "subTitle");
            int iA5 = a.a(cursorR, "message");
            int iA6 = a.a(cursorR, "positiveAction");
            int iA7 = a.a(cursorR, "negativeAction");
            int iA8 = a.a(cursorR, "phoneNumber");
            int iA9 = a.a(cursorR, "cacheKey");
            int iA10 = a.a(cursorR, "cacheId");
            int iA11 = a.a(cursorR, "notificationKey");
            int iA12 = a.a(cursorR, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            int iA13 = a.a(cursorR, "groupKey");
            l0Var = l0VarE;
            try {
                int iA14 = a.a(cursorR, NotificationConstants.KEY_DATA_MIME_TYPE);
                int iA15 = a.a(cursorR, "postTime");
                int iA16 = a.a(cursorR, "when");
                int iA17 = a.a(cursorR, "positiveActionIndex");
                int iA18 = a.a(cursorR, "negativeActionIndex");
                int iA19 = a.a(cursorR, "notificationFlags");
                int iA20 = a.a(cursorR, "eventFlags");
                int iA21 = a.a(cursorR, "extraFlags");
                int iA22 = a.a(cursorR, "category");
                int iA23 = a.a(cursorR, "priority");
                int iA24 = a.a(cursorR, "numEvents");
                int iA25 = a.a(cursorR, "isProgressUpdate");
                int iA26 = a.a(cursorR, "hasLargeIcon");
                int iA27 = a.a(cursorR, "conversationId");
                int iA28 = a.a(cursorR, "isSuppressed");
                int iA29 = a.a(cursorR, "numRemoteViewImages");
                int iA30 = a.a(cursorR, "actions");
                int iA31 = a.a(cursorR, "images");
                int iA32 = a.a(cursorR, "callType");
                int i14 = iA13;
                ArrayList arrayList = new ArrayList(cursorR.getCount());
                while (cursorR.moveToNext()) {
                    GNCSNotificationInfo gNCSNotificationInfo = new GNCSNotificationInfo();
                    ArrayList arrayList2 = arrayList;
                    int i15 = iA;
                    gNCSNotificationInfo.status = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationStatusValue(cursorR.isNull(iA) ? null : cursorR.getString(iA));
                    try {
                        gNCSNotificationInfo.statusTimestamp = cursorR.getLong(iA2);
                        if (cursorR.isNull(iA3)) {
                            gNCSNotificationInfo.title = null;
                        } else {
                            gNCSNotificationInfo.title = cursorR.getString(iA3);
                        }
                        if (cursorR.isNull(iA4)) {
                            gNCSNotificationInfo.subTitle = null;
                        } else {
                            gNCSNotificationInfo.subTitle = cursorR.getString(iA4);
                        }
                        if (cursorR.isNull(iA5)) {
                            gNCSNotificationInfo.message = null;
                        } else {
                            gNCSNotificationInfo.message = cursorR.getString(iA5);
                        }
                        if (cursorR.isNull(iA6)) {
                            gNCSNotificationInfo.positiveAction = null;
                        } else {
                            gNCSNotificationInfo.positiveAction = cursorR.getString(iA6);
                        }
                        if (cursorR.isNull(iA7)) {
                            gNCSNotificationInfo.negativeAction = null;
                        } else {
                            gNCSNotificationInfo.negativeAction = cursorR.getString(iA7);
                        }
                        if (cursorR.isNull(iA8)) {
                            gNCSNotificationInfo.phoneNumber = null;
                        } else {
                            gNCSNotificationInfo.phoneNumber = cursorR.getString(iA8);
                        }
                        if (cursorR.isNull(iA9)) {
                            gNCSNotificationInfo.cacheKey = null;
                        } else {
                            gNCSNotificationInfo.cacheKey = cursorR.getString(iA9);
                        }
                        gNCSNotificationInfo.cacheId = cursorR.getLong(iA10);
                        if (cursorR.isNull(iA11)) {
                            gNCSNotificationInfo.notificationKey = null;
                        } else {
                            gNCSNotificationInfo.notificationKey = cursorR.getString(iA11);
                        }
                        if (cursorR.isNull(iA12)) {
                            gNCSNotificationInfo.packageName = null;
                        } else {
                            gNCSNotificationInfo.packageName = cursorR.getString(iA12);
                        }
                        int i16 = i14;
                        if (cursorR.isNull(i16)) {
                            gNCSNotificationInfo.groupKey = null;
                        } else {
                            gNCSNotificationInfo.groupKey = cursorR.getString(i16);
                        }
                        int i17 = iA14;
                        String string = cursorR.isNull(i17) ? null : cursorR.getString(i17);
                        i14 = i16;
                        iA14 = i17;
                        gNCSNotificationDAO_Impl = this;
                        gNCSNotificationInfo.type = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationTypeValue(string);
                        int i18 = iA2;
                        int i19 = iA15;
                        int i24 = iA3;
                        gNCSNotificationInfo.postTime = cursorR.getLong(i19);
                        int i25 = iA16;
                        int i26 = iA4;
                        gNCSNotificationInfo.when = cursorR.getLong(i25);
                        int i27 = iA17;
                        gNCSNotificationInfo.positiveActionIndex = cursorR.getInt(i27);
                        int i28 = iA18;
                        gNCSNotificationInfo.negativeActionIndex = cursorR.getInt(i28);
                        int i29 = iA19;
                        gNCSNotificationInfo.notificationFlags = cursorR.getInt(i29);
                        iA19 = i29;
                        int i30 = iA20;
                        gNCSNotificationInfo.eventFlags = cursorR.getInt(i30);
                        iA20 = i30;
                        iA21 = iA21;
                        gNCSNotificationInfo.extraFlags = cursorR.getInt(iA21);
                        int i34 = iA22;
                        if (cursorR.isNull(i34)) {
                            gNCSNotificationInfo.category = null;
                        } else {
                            gNCSNotificationInfo.category = cursorR.getString(i34);
                        }
                        iA22 = i34;
                        int i35 = iA23;
                        gNCSNotificationInfo.priority = cursorR.getInt(i35);
                        iA23 = i35;
                        int i36 = iA24;
                        gNCSNotificationInfo.numEvents = cursorR.getInt(i36);
                        iA24 = i36;
                        int i37 = iA25;
                        gNCSNotificationInfo.isProgressUpdate = cursorR.getInt(i37);
                        iA25 = i37;
                        int i38 = iA26;
                        iA26 = i38;
                        gNCSNotificationInfo.hasLargeIcon = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i38));
                        int i39 = iA27;
                        if (cursorR.isNull(i39)) {
                            gNCSNotificationInfo.conversationId = null;
                        } else {
                            gNCSNotificationInfo.conversationId = cursorR.getString(i39);
                        }
                        iA27 = i39;
                        int i44 = iA28;
                        iA28 = i44;
                        gNCSNotificationInfo.isSuppressed = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i44));
                        int i45 = iA29;
                        gNCSNotificationInfo.numRemoteViewImages = cursorR.getInt(i45);
                        int i46 = iA30;
                        gNCSNotificationInfo.actions = gNCSNotificationDAO_Impl.__gNCSConverters.stringToActions(cursorR.isNull(i46) ? null : cursorR.getString(i46));
                        int i47 = iA31;
                        iA31 = i47;
                        gNCSNotificationInfo.images = gNCSNotificationDAO_Impl.__gNCSConverters.stringToImages(cursorR.isNull(i47) ? null : cursorR.getString(i47));
                        int i48 = iA32;
                        gNCSNotificationInfo.callType = cursorR.getInt(i48);
                        arrayList = arrayList2;
                        arrayList.add(gNCSNotificationInfo);
                        iA16 = i25;
                        iA2 = i18;
                        iA18 = i28;
                        iA4 = i26;
                        iA17 = i27;
                        iA3 = i24;
                        iA15 = i19;
                        iA30 = i46;
                        iA29 = i45;
                        iA32 = i48;
                        iA = i15;
                    } catch (Throwable th3) {
                        th = th3;
                        cursorR.close();
                        l0Var.release();
                        throw th;
                    }
                }
                cursorR.close();
                l0Var.release();
                return arrayList;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            l0Var = l0VarE;
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public List<GNCSNotificationInfo> getBlockedNotificationsOfCategory(String str) throws Throwable {
        l0 l0Var;
        GNCSNotificationDAO_Impl gNCSNotificationDAO_Impl = this;
        l0 l0VarE = l0.e(1, "SELECT * FROM notification_info WHERE category = ? AND status = 'DNS'");
        if (str == null) {
            l0VarE.u(1);
        } else {
            l0VarE.r(1, str);
        }
        gNCSNotificationDAO_Impl.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(gNCSNotificationDAO_Impl.__db, l0VarE);
        try {
            int iA = a.a(cursorR, "status");
            int iA2 = a.a(cursorR, "statusTimestamp");
            int iA3 = a.a(cursorR, "title");
            int iA4 = a.a(cursorR, "subTitle");
            int iA5 = a.a(cursorR, "message");
            int iA6 = a.a(cursorR, "positiveAction");
            int iA7 = a.a(cursorR, "negativeAction");
            int iA8 = a.a(cursorR, "phoneNumber");
            int iA9 = a.a(cursorR, "cacheKey");
            int iA10 = a.a(cursorR, "cacheId");
            int iA11 = a.a(cursorR, "notificationKey");
            int iA12 = a.a(cursorR, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            int iA13 = a.a(cursorR, "groupKey");
            l0Var = l0VarE;
            try {
                int iA14 = a.a(cursorR, NotificationConstants.KEY_DATA_MIME_TYPE);
                int iA15 = a.a(cursorR, "postTime");
                int iA16 = a.a(cursorR, "when");
                int iA17 = a.a(cursorR, "positiveActionIndex");
                int iA18 = a.a(cursorR, "negativeActionIndex");
                int iA19 = a.a(cursorR, "notificationFlags");
                int iA20 = a.a(cursorR, "eventFlags");
                int iA21 = a.a(cursorR, "extraFlags");
                int iA22 = a.a(cursorR, "category");
                int iA23 = a.a(cursorR, "priority");
                int iA24 = a.a(cursorR, "numEvents");
                int iA25 = a.a(cursorR, "isProgressUpdate");
                int iA26 = a.a(cursorR, "hasLargeIcon");
                int iA27 = a.a(cursorR, "conversationId");
                int iA28 = a.a(cursorR, "isSuppressed");
                int iA29 = a.a(cursorR, "numRemoteViewImages");
                int iA30 = a.a(cursorR, "actions");
                int iA31 = a.a(cursorR, "images");
                int iA32 = a.a(cursorR, "callType");
                int i14 = iA13;
                ArrayList arrayList = new ArrayList(cursorR.getCount());
                while (cursorR.moveToNext()) {
                    GNCSNotificationInfo gNCSNotificationInfo = new GNCSNotificationInfo();
                    ArrayList arrayList2 = arrayList;
                    int i15 = iA;
                    gNCSNotificationInfo.status = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationStatusValue(cursorR.isNull(iA) ? null : cursorR.getString(iA));
                    try {
                        gNCSNotificationInfo.statusTimestamp = cursorR.getLong(iA2);
                        if (cursorR.isNull(iA3)) {
                            gNCSNotificationInfo.title = null;
                        } else {
                            gNCSNotificationInfo.title = cursorR.getString(iA3);
                        }
                        if (cursorR.isNull(iA4)) {
                            gNCSNotificationInfo.subTitle = null;
                        } else {
                            gNCSNotificationInfo.subTitle = cursorR.getString(iA4);
                        }
                        if (cursorR.isNull(iA5)) {
                            gNCSNotificationInfo.message = null;
                        } else {
                            gNCSNotificationInfo.message = cursorR.getString(iA5);
                        }
                        if (cursorR.isNull(iA6)) {
                            gNCSNotificationInfo.positiveAction = null;
                        } else {
                            gNCSNotificationInfo.positiveAction = cursorR.getString(iA6);
                        }
                        if (cursorR.isNull(iA7)) {
                            gNCSNotificationInfo.negativeAction = null;
                        } else {
                            gNCSNotificationInfo.negativeAction = cursorR.getString(iA7);
                        }
                        if (cursorR.isNull(iA8)) {
                            gNCSNotificationInfo.phoneNumber = null;
                        } else {
                            gNCSNotificationInfo.phoneNumber = cursorR.getString(iA8);
                        }
                        if (cursorR.isNull(iA9)) {
                            gNCSNotificationInfo.cacheKey = null;
                        } else {
                            gNCSNotificationInfo.cacheKey = cursorR.getString(iA9);
                        }
                        gNCSNotificationInfo.cacheId = cursorR.getLong(iA10);
                        if (cursorR.isNull(iA11)) {
                            gNCSNotificationInfo.notificationKey = null;
                        } else {
                            gNCSNotificationInfo.notificationKey = cursorR.getString(iA11);
                        }
                        if (cursorR.isNull(iA12)) {
                            gNCSNotificationInfo.packageName = null;
                        } else {
                            gNCSNotificationInfo.packageName = cursorR.getString(iA12);
                        }
                        int i16 = i14;
                        if (cursorR.isNull(i16)) {
                            gNCSNotificationInfo.groupKey = null;
                        } else {
                            gNCSNotificationInfo.groupKey = cursorR.getString(i16);
                        }
                        int i17 = iA14;
                        String string = cursorR.isNull(i17) ? null : cursorR.getString(i17);
                        i14 = i16;
                        iA14 = i17;
                        gNCSNotificationDAO_Impl = this;
                        gNCSNotificationInfo.type = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationTypeValue(string);
                        int i18 = iA15;
                        int i19 = iA2;
                        gNCSNotificationInfo.postTime = cursorR.getLong(i18);
                        int i24 = iA16;
                        int i25 = iA3;
                        gNCSNotificationInfo.when = cursorR.getLong(i24);
                        int i26 = iA17;
                        gNCSNotificationInfo.positiveActionIndex = cursorR.getInt(i26);
                        int i27 = iA18;
                        gNCSNotificationInfo.negativeActionIndex = cursorR.getInt(i27);
                        int i28 = iA19;
                        gNCSNotificationInfo.notificationFlags = cursorR.getInt(i28);
                        iA19 = i28;
                        int i29 = iA20;
                        gNCSNotificationInfo.eventFlags = cursorR.getInt(i29);
                        iA20 = i29;
                        iA21 = iA21;
                        gNCSNotificationInfo.extraFlags = cursorR.getInt(iA21);
                        int i30 = iA22;
                        if (cursorR.isNull(i30)) {
                            gNCSNotificationInfo.category = null;
                        } else {
                            gNCSNotificationInfo.category = cursorR.getString(i30);
                        }
                        iA22 = i30;
                        int i34 = iA23;
                        gNCSNotificationInfo.priority = cursorR.getInt(i34);
                        iA23 = i34;
                        int i35 = iA24;
                        gNCSNotificationInfo.numEvents = cursorR.getInt(i35);
                        iA24 = i35;
                        int i36 = iA25;
                        gNCSNotificationInfo.isProgressUpdate = cursorR.getInt(i36);
                        iA25 = i36;
                        int i37 = iA26;
                        iA26 = i37;
                        gNCSNotificationInfo.hasLargeIcon = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i37));
                        int i38 = iA27;
                        if (cursorR.isNull(i38)) {
                            gNCSNotificationInfo.conversationId = null;
                        } else {
                            gNCSNotificationInfo.conversationId = cursorR.getString(i38);
                        }
                        iA27 = i38;
                        int i39 = iA28;
                        iA28 = i39;
                        gNCSNotificationInfo.isSuppressed = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i39));
                        int i44 = iA29;
                        gNCSNotificationInfo.numRemoteViewImages = cursorR.getInt(i44);
                        int i45 = iA30;
                        gNCSNotificationInfo.actions = gNCSNotificationDAO_Impl.__gNCSConverters.stringToActions(cursorR.isNull(i45) ? null : cursorR.getString(i45));
                        int i46 = iA31;
                        iA31 = i46;
                        gNCSNotificationInfo.images = gNCSNotificationDAO_Impl.__gNCSConverters.stringToImages(cursorR.isNull(i46) ? null : cursorR.getString(i46));
                        int i47 = iA32;
                        gNCSNotificationInfo.callType = cursorR.getInt(i47);
                        arrayList = arrayList2;
                        arrayList.add(gNCSNotificationInfo);
                        iA17 = i26;
                        iA2 = i19;
                        iA15 = i18;
                        iA18 = i27;
                        iA3 = i25;
                        iA16 = i24;
                        iA30 = i45;
                        iA29 = i44;
                        iA32 = i47;
                        iA = i15;
                    } catch (Throwable th3) {
                        th = th3;
                        cursorR.close();
                        l0Var.release();
                        throw th;
                    }
                }
                cursorR.close();
                l0Var.release();
                return arrayList;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            l0Var = l0VarE;
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public int getMaxCacheId() {
        l0 l0VarE = l0.e(0, "SELECT MAX(cacheId) FROM notification_info");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(this.__db, l0VarE);
        try {
            return cursorR.moveToFirst() ? cursorR.getInt(0) : 0;
        } finally {
            cursorR.close();
            l0VarE.release();
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public GNCSNotificationInfo getNotification(String str) throws Throwable {
        l0 l0Var;
        GNCSNotificationInfo gNCSNotificationInfo;
        String str2;
        l0 l0VarE = l0.e(1, "SELECT * FROM notification_info WHERE cacheKey = ?");
        if (str == null) {
            l0VarE.u(1);
        } else {
            l0VarE.r(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(this.__db, l0VarE);
        try {
            int iA = a.a(cursorR, "status");
            int iA2 = a.a(cursorR, "statusTimestamp");
            int iA3 = a.a(cursorR, "title");
            int iA4 = a.a(cursorR, "subTitle");
            int iA5 = a.a(cursorR, "message");
            int iA6 = a.a(cursorR, "positiveAction");
            int iA7 = a.a(cursorR, "negativeAction");
            int iA8 = a.a(cursorR, "phoneNumber");
            int iA9 = a.a(cursorR, "cacheKey");
            int iA10 = a.a(cursorR, "cacheId");
            int iA11 = a.a(cursorR, "notificationKey");
            int iA12 = a.a(cursorR, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            int iA13 = a.a(cursorR, "groupKey");
            l0Var = l0VarE;
            try {
                int iA14 = a.a(cursorR, NotificationConstants.KEY_DATA_MIME_TYPE);
                int iA15 = a.a(cursorR, "postTime");
                int iA16 = a.a(cursorR, "when");
                int iA17 = a.a(cursorR, "positiveActionIndex");
                int iA18 = a.a(cursorR, "negativeActionIndex");
                int iA19 = a.a(cursorR, "notificationFlags");
                int iA20 = a.a(cursorR, "eventFlags");
                int iA21 = a.a(cursorR, "extraFlags");
                int iA22 = a.a(cursorR, "category");
                int iA23 = a.a(cursorR, "priority");
                int iA24 = a.a(cursorR, "numEvents");
                int iA25 = a.a(cursorR, "isProgressUpdate");
                int iA26 = a.a(cursorR, "hasLargeIcon");
                int iA27 = a.a(cursorR, "conversationId");
                int iA28 = a.a(cursorR, "isSuppressed");
                int iA29 = a.a(cursorR, "numRemoteViewImages");
                int iA30 = a.a(cursorR, "actions");
                int iA31 = a.a(cursorR, "images");
                int iA32 = a.a(cursorR, "callType");
                if (cursorR.moveToFirst()) {
                    gNCSNotificationInfo = new GNCSNotificationInfo();
                    gNCSNotificationInfo.status = this.__gNCSConverters.fromNotificationStatusValue(cursorR.isNull(iA) ? null : cursorR.getString(iA));
                    try {
                        gNCSNotificationInfo.statusTimestamp = cursorR.getLong(iA2);
                        if (cursorR.isNull(iA3)) {
                            gNCSNotificationInfo.title = null;
                        } else {
                            gNCSNotificationInfo.title = cursorR.getString(iA3);
                        }
                        if (cursorR.isNull(iA4)) {
                            gNCSNotificationInfo.subTitle = null;
                        } else {
                            gNCSNotificationInfo.subTitle = cursorR.getString(iA4);
                        }
                        if (cursorR.isNull(iA5)) {
                            gNCSNotificationInfo.message = null;
                        } else {
                            gNCSNotificationInfo.message = cursorR.getString(iA5);
                        }
                        if (cursorR.isNull(iA6)) {
                            gNCSNotificationInfo.positiveAction = null;
                        } else {
                            gNCSNotificationInfo.positiveAction = cursorR.getString(iA6);
                        }
                        if (cursorR.isNull(iA7)) {
                            gNCSNotificationInfo.negativeAction = null;
                        } else {
                            gNCSNotificationInfo.negativeAction = cursorR.getString(iA7);
                        }
                        if (cursorR.isNull(iA8)) {
                            gNCSNotificationInfo.phoneNumber = null;
                        } else {
                            gNCSNotificationInfo.phoneNumber = cursorR.getString(iA8);
                        }
                        if (cursorR.isNull(iA9)) {
                            gNCSNotificationInfo.cacheKey = null;
                        } else {
                            gNCSNotificationInfo.cacheKey = cursorR.getString(iA9);
                        }
                        gNCSNotificationInfo.cacheId = cursorR.getLong(iA10);
                        if (cursorR.isNull(iA11)) {
                            gNCSNotificationInfo.notificationKey = null;
                        } else {
                            gNCSNotificationInfo.notificationKey = cursorR.getString(iA11);
                        }
                        if (cursorR.isNull(iA12)) {
                            gNCSNotificationInfo.packageName = null;
                        } else {
                            gNCSNotificationInfo.packageName = cursorR.getString(iA12);
                        }
                        if (cursorR.isNull(iA13)) {
                            gNCSNotificationInfo.groupKey = null;
                        } else {
                            gNCSNotificationInfo.groupKey = cursorR.getString(iA13);
                        }
                        gNCSNotificationInfo.type = this.__gNCSConverters.fromNotificationTypeValue(cursorR.isNull(iA14) ? null : cursorR.getString(iA14));
                        gNCSNotificationInfo.postTime = cursorR.getLong(iA15);
                        gNCSNotificationInfo.when = cursorR.getLong(iA16);
                        gNCSNotificationInfo.positiveActionIndex = cursorR.getInt(iA17);
                        gNCSNotificationInfo.negativeActionIndex = cursorR.getInt(iA18);
                        gNCSNotificationInfo.notificationFlags = cursorR.getInt(iA19);
                        gNCSNotificationInfo.eventFlags = cursorR.getInt(iA20);
                        gNCSNotificationInfo.extraFlags = cursorR.getInt(iA21);
                        if (cursorR.isNull(iA22)) {
                            gNCSNotificationInfo.category = null;
                        } else {
                            gNCSNotificationInfo.category = cursorR.getString(iA22);
                        }
                        gNCSNotificationInfo.priority = cursorR.getInt(iA23);
                        gNCSNotificationInfo.numEvents = cursorR.getInt(iA24);
                        gNCSNotificationInfo.isProgressUpdate = cursorR.getInt(iA25);
                        gNCSNotificationInfo.hasLargeIcon = this.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(iA26));
                        if (cursorR.isNull(iA27)) {
                            str2 = null;
                            gNCSNotificationInfo.conversationId = null;
                        } else {
                            str2 = null;
                            gNCSNotificationInfo.conversationId = cursorR.getString(iA27);
                        }
                        gNCSNotificationInfo.isSuppressed = this.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(iA28));
                        gNCSNotificationInfo.numRemoteViewImages = cursorR.getInt(iA29);
                        gNCSNotificationInfo.actions = this.__gNCSConverters.stringToActions(cursorR.isNull(iA30) ? str2 : cursorR.getString(iA30));
                        gNCSNotificationInfo.images = this.__gNCSConverters.stringToImages(cursorR.isNull(iA31) ? str2 : cursorR.getString(iA31));
                        gNCSNotificationInfo.callType = cursorR.getInt(iA32);
                    } catch (Throwable th3) {
                        th = th3;
                        cursorR.close();
                        l0Var.release();
                        throw th;
                    }
                } else {
                    gNCSNotificationInfo = null;
                }
                cursorR.close();
                l0Var.release();
                return gNCSNotificationInfo;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            l0Var = l0VarE;
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public int getNotificationCountByGroup(String str) {
        l0 l0VarE = l0.e(1, "SELECT COUNT(*) FROM notification_info WHERE groupKey = ?");
        if (str == null) {
            l0VarE.u(1);
        } else {
            l0VarE.r(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(this.__db, l0VarE);
        try {
            return cursorR.moveToFirst() ? cursorR.getInt(0) : 0;
        } finally {
            cursorR.close();
            l0VarE.release();
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public List<GNCSNotificationInfo> getNotifications(GNCSNotificationInfo.NotificationType notificationType) throws Throwable {
        l0 l0Var;
        GNCSNotificationDAO_Impl gNCSNotificationDAO_Impl = this;
        l0 l0VarE = l0.e(1, "SELECT * FROM notification_info WHERE type = ?");
        String notificationType2 = gNCSNotificationDAO_Impl.__gNCSConverters.toNotificationType(notificationType);
        if (notificationType2 == null) {
            l0VarE.u(1);
        } else {
            l0VarE.r(1, notificationType2);
        }
        gNCSNotificationDAO_Impl.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(gNCSNotificationDAO_Impl.__db, l0VarE);
        try {
            int iA = a.a(cursorR, "status");
            int iA2 = a.a(cursorR, "statusTimestamp");
            int iA3 = a.a(cursorR, "title");
            int iA4 = a.a(cursorR, "subTitle");
            int iA5 = a.a(cursorR, "message");
            int iA6 = a.a(cursorR, "positiveAction");
            int iA7 = a.a(cursorR, "negativeAction");
            int iA8 = a.a(cursorR, "phoneNumber");
            int iA9 = a.a(cursorR, "cacheKey");
            int iA10 = a.a(cursorR, "cacheId");
            int iA11 = a.a(cursorR, "notificationKey");
            int iA12 = a.a(cursorR, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            int iA13 = a.a(cursorR, "groupKey");
            l0Var = l0VarE;
            try {
                int iA14 = a.a(cursorR, NotificationConstants.KEY_DATA_MIME_TYPE);
                int iA15 = a.a(cursorR, "postTime");
                int iA16 = a.a(cursorR, "when");
                int iA17 = a.a(cursorR, "positiveActionIndex");
                int iA18 = a.a(cursorR, "negativeActionIndex");
                int iA19 = a.a(cursorR, "notificationFlags");
                int iA20 = a.a(cursorR, "eventFlags");
                int iA21 = a.a(cursorR, "extraFlags");
                int iA22 = a.a(cursorR, "category");
                int iA23 = a.a(cursorR, "priority");
                int iA24 = a.a(cursorR, "numEvents");
                int iA25 = a.a(cursorR, "isProgressUpdate");
                int iA26 = a.a(cursorR, "hasLargeIcon");
                int iA27 = a.a(cursorR, "conversationId");
                int iA28 = a.a(cursorR, "isSuppressed");
                int iA29 = a.a(cursorR, "numRemoteViewImages");
                int iA30 = a.a(cursorR, "actions");
                int iA31 = a.a(cursorR, "images");
                int iA32 = a.a(cursorR, "callType");
                int i14 = iA13;
                ArrayList arrayList = new ArrayList(cursorR.getCount());
                while (cursorR.moveToNext()) {
                    GNCSNotificationInfo gNCSNotificationInfo = new GNCSNotificationInfo();
                    ArrayList arrayList2 = arrayList;
                    int i15 = iA;
                    gNCSNotificationInfo.status = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationStatusValue(cursorR.isNull(iA) ? null : cursorR.getString(iA));
                    try {
                        gNCSNotificationInfo.statusTimestamp = cursorR.getLong(iA2);
                        if (cursorR.isNull(iA3)) {
                            gNCSNotificationInfo.title = null;
                        } else {
                            gNCSNotificationInfo.title = cursorR.getString(iA3);
                        }
                        if (cursorR.isNull(iA4)) {
                            gNCSNotificationInfo.subTitle = null;
                        } else {
                            gNCSNotificationInfo.subTitle = cursorR.getString(iA4);
                        }
                        if (cursorR.isNull(iA5)) {
                            gNCSNotificationInfo.message = null;
                        } else {
                            gNCSNotificationInfo.message = cursorR.getString(iA5);
                        }
                        if (cursorR.isNull(iA6)) {
                            gNCSNotificationInfo.positiveAction = null;
                        } else {
                            gNCSNotificationInfo.positiveAction = cursorR.getString(iA6);
                        }
                        if (cursorR.isNull(iA7)) {
                            gNCSNotificationInfo.negativeAction = null;
                        } else {
                            gNCSNotificationInfo.negativeAction = cursorR.getString(iA7);
                        }
                        if (cursorR.isNull(iA8)) {
                            gNCSNotificationInfo.phoneNumber = null;
                        } else {
                            gNCSNotificationInfo.phoneNumber = cursorR.getString(iA8);
                        }
                        if (cursorR.isNull(iA9)) {
                            gNCSNotificationInfo.cacheKey = null;
                        } else {
                            gNCSNotificationInfo.cacheKey = cursorR.getString(iA9);
                        }
                        gNCSNotificationInfo.cacheId = cursorR.getLong(iA10);
                        if (cursorR.isNull(iA11)) {
                            gNCSNotificationInfo.notificationKey = null;
                        } else {
                            gNCSNotificationInfo.notificationKey = cursorR.getString(iA11);
                        }
                        if (cursorR.isNull(iA12)) {
                            gNCSNotificationInfo.packageName = null;
                        } else {
                            gNCSNotificationInfo.packageName = cursorR.getString(iA12);
                        }
                        int i16 = i14;
                        if (cursorR.isNull(i16)) {
                            gNCSNotificationInfo.groupKey = null;
                        } else {
                            gNCSNotificationInfo.groupKey = cursorR.getString(i16);
                        }
                        int i17 = iA14;
                        String string = cursorR.isNull(i17) ? null : cursorR.getString(i17);
                        i14 = i16;
                        iA14 = i17;
                        gNCSNotificationDAO_Impl = this;
                        gNCSNotificationInfo.type = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationTypeValue(string);
                        int i18 = iA2;
                        int i19 = iA15;
                        int i24 = iA3;
                        gNCSNotificationInfo.postTime = cursorR.getLong(i19);
                        int i25 = iA16;
                        int i26 = iA4;
                        gNCSNotificationInfo.when = cursorR.getLong(i25);
                        int i27 = iA17;
                        gNCSNotificationInfo.positiveActionIndex = cursorR.getInt(i27);
                        int i28 = iA18;
                        gNCSNotificationInfo.negativeActionIndex = cursorR.getInt(i28);
                        int i29 = iA19;
                        gNCSNotificationInfo.notificationFlags = cursorR.getInt(i29);
                        iA19 = i29;
                        int i30 = iA20;
                        gNCSNotificationInfo.eventFlags = cursorR.getInt(i30);
                        iA20 = i30;
                        iA21 = iA21;
                        gNCSNotificationInfo.extraFlags = cursorR.getInt(iA21);
                        int i34 = iA22;
                        if (cursorR.isNull(i34)) {
                            gNCSNotificationInfo.category = null;
                        } else {
                            gNCSNotificationInfo.category = cursorR.getString(i34);
                        }
                        iA22 = i34;
                        int i35 = iA23;
                        gNCSNotificationInfo.priority = cursorR.getInt(i35);
                        iA23 = i35;
                        int i36 = iA24;
                        gNCSNotificationInfo.numEvents = cursorR.getInt(i36);
                        iA24 = i36;
                        int i37 = iA25;
                        gNCSNotificationInfo.isProgressUpdate = cursorR.getInt(i37);
                        iA25 = i37;
                        int i38 = iA26;
                        iA26 = i38;
                        gNCSNotificationInfo.hasLargeIcon = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i38));
                        int i39 = iA27;
                        if (cursorR.isNull(i39)) {
                            gNCSNotificationInfo.conversationId = null;
                        } else {
                            gNCSNotificationInfo.conversationId = cursorR.getString(i39);
                        }
                        iA27 = i39;
                        int i44 = iA28;
                        iA28 = i44;
                        gNCSNotificationInfo.isSuppressed = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i44));
                        int i45 = iA29;
                        gNCSNotificationInfo.numRemoteViewImages = cursorR.getInt(i45);
                        int i46 = iA30;
                        gNCSNotificationInfo.actions = gNCSNotificationDAO_Impl.__gNCSConverters.stringToActions(cursorR.isNull(i46) ? null : cursorR.getString(i46));
                        int i47 = iA31;
                        iA31 = i47;
                        gNCSNotificationInfo.images = gNCSNotificationDAO_Impl.__gNCSConverters.stringToImages(cursorR.isNull(i47) ? null : cursorR.getString(i47));
                        int i48 = iA32;
                        gNCSNotificationInfo.callType = cursorR.getInt(i48);
                        arrayList = arrayList2;
                        arrayList.add(gNCSNotificationInfo);
                        iA16 = i25;
                        iA2 = i18;
                        iA18 = i28;
                        iA4 = i26;
                        iA17 = i27;
                        iA3 = i24;
                        iA15 = i19;
                        iA30 = i46;
                        iA29 = i45;
                        iA32 = i48;
                        iA = i15;
                    } catch (Throwable th3) {
                        th = th3;
                        cursorR.close();
                        l0Var.release();
                        throw th;
                    }
                }
                cursorR.close();
                l0Var.release();
                return arrayList;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            l0Var = l0VarE;
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public List<GNCSNotificationInfo> getNotificationsByGroup(String str) throws Throwable {
        l0 l0Var;
        GNCSNotificationDAO_Impl gNCSNotificationDAO_Impl = this;
        l0 l0VarE = l0.e(1, "SELECT * FROM notification_info WHERE groupKey = ?");
        if (str == null) {
            l0VarE.u(1);
        } else {
            l0VarE.r(1, str);
        }
        gNCSNotificationDAO_Impl.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(gNCSNotificationDAO_Impl.__db, l0VarE);
        try {
            int iA = a.a(cursorR, "status");
            int iA2 = a.a(cursorR, "statusTimestamp");
            int iA3 = a.a(cursorR, "title");
            int iA4 = a.a(cursorR, "subTitle");
            int iA5 = a.a(cursorR, "message");
            int iA6 = a.a(cursorR, "positiveAction");
            int iA7 = a.a(cursorR, "negativeAction");
            int iA8 = a.a(cursorR, "phoneNumber");
            int iA9 = a.a(cursorR, "cacheKey");
            int iA10 = a.a(cursorR, "cacheId");
            int iA11 = a.a(cursorR, "notificationKey");
            int iA12 = a.a(cursorR, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            int iA13 = a.a(cursorR, "groupKey");
            l0Var = l0VarE;
            try {
                int iA14 = a.a(cursorR, NotificationConstants.KEY_DATA_MIME_TYPE);
                int iA15 = a.a(cursorR, "postTime");
                int iA16 = a.a(cursorR, "when");
                int iA17 = a.a(cursorR, "positiveActionIndex");
                int iA18 = a.a(cursorR, "negativeActionIndex");
                int iA19 = a.a(cursorR, "notificationFlags");
                int iA20 = a.a(cursorR, "eventFlags");
                int iA21 = a.a(cursorR, "extraFlags");
                int iA22 = a.a(cursorR, "category");
                int iA23 = a.a(cursorR, "priority");
                int iA24 = a.a(cursorR, "numEvents");
                int iA25 = a.a(cursorR, "isProgressUpdate");
                int iA26 = a.a(cursorR, "hasLargeIcon");
                int iA27 = a.a(cursorR, "conversationId");
                int iA28 = a.a(cursorR, "isSuppressed");
                int iA29 = a.a(cursorR, "numRemoteViewImages");
                int iA30 = a.a(cursorR, "actions");
                int iA31 = a.a(cursorR, "images");
                int iA32 = a.a(cursorR, "callType");
                int i14 = iA13;
                ArrayList arrayList = new ArrayList(cursorR.getCount());
                while (cursorR.moveToNext()) {
                    GNCSNotificationInfo gNCSNotificationInfo = new GNCSNotificationInfo();
                    ArrayList arrayList2 = arrayList;
                    int i15 = iA;
                    gNCSNotificationInfo.status = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationStatusValue(cursorR.isNull(iA) ? null : cursorR.getString(iA));
                    try {
                        gNCSNotificationInfo.statusTimestamp = cursorR.getLong(iA2);
                        if (cursorR.isNull(iA3)) {
                            gNCSNotificationInfo.title = null;
                        } else {
                            gNCSNotificationInfo.title = cursorR.getString(iA3);
                        }
                        if (cursorR.isNull(iA4)) {
                            gNCSNotificationInfo.subTitle = null;
                        } else {
                            gNCSNotificationInfo.subTitle = cursorR.getString(iA4);
                        }
                        if (cursorR.isNull(iA5)) {
                            gNCSNotificationInfo.message = null;
                        } else {
                            gNCSNotificationInfo.message = cursorR.getString(iA5);
                        }
                        if (cursorR.isNull(iA6)) {
                            gNCSNotificationInfo.positiveAction = null;
                        } else {
                            gNCSNotificationInfo.positiveAction = cursorR.getString(iA6);
                        }
                        if (cursorR.isNull(iA7)) {
                            gNCSNotificationInfo.negativeAction = null;
                        } else {
                            gNCSNotificationInfo.negativeAction = cursorR.getString(iA7);
                        }
                        if (cursorR.isNull(iA8)) {
                            gNCSNotificationInfo.phoneNumber = null;
                        } else {
                            gNCSNotificationInfo.phoneNumber = cursorR.getString(iA8);
                        }
                        if (cursorR.isNull(iA9)) {
                            gNCSNotificationInfo.cacheKey = null;
                        } else {
                            gNCSNotificationInfo.cacheKey = cursorR.getString(iA9);
                        }
                        gNCSNotificationInfo.cacheId = cursorR.getLong(iA10);
                        if (cursorR.isNull(iA11)) {
                            gNCSNotificationInfo.notificationKey = null;
                        } else {
                            gNCSNotificationInfo.notificationKey = cursorR.getString(iA11);
                        }
                        if (cursorR.isNull(iA12)) {
                            gNCSNotificationInfo.packageName = null;
                        } else {
                            gNCSNotificationInfo.packageName = cursorR.getString(iA12);
                        }
                        int i16 = i14;
                        if (cursorR.isNull(i16)) {
                            gNCSNotificationInfo.groupKey = null;
                        } else {
                            gNCSNotificationInfo.groupKey = cursorR.getString(i16);
                        }
                        int i17 = iA14;
                        String string = cursorR.isNull(i17) ? null : cursorR.getString(i17);
                        i14 = i16;
                        iA14 = i17;
                        gNCSNotificationDAO_Impl = this;
                        gNCSNotificationInfo.type = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationTypeValue(string);
                        int i18 = iA15;
                        int i19 = iA2;
                        gNCSNotificationInfo.postTime = cursorR.getLong(i18);
                        int i24 = iA16;
                        int i25 = iA3;
                        gNCSNotificationInfo.when = cursorR.getLong(i24);
                        int i26 = iA17;
                        gNCSNotificationInfo.positiveActionIndex = cursorR.getInt(i26);
                        int i27 = iA18;
                        gNCSNotificationInfo.negativeActionIndex = cursorR.getInt(i27);
                        int i28 = iA19;
                        gNCSNotificationInfo.notificationFlags = cursorR.getInt(i28);
                        iA19 = i28;
                        int i29 = iA20;
                        gNCSNotificationInfo.eventFlags = cursorR.getInt(i29);
                        iA20 = i29;
                        iA21 = iA21;
                        gNCSNotificationInfo.extraFlags = cursorR.getInt(iA21);
                        int i30 = iA22;
                        if (cursorR.isNull(i30)) {
                            gNCSNotificationInfo.category = null;
                        } else {
                            gNCSNotificationInfo.category = cursorR.getString(i30);
                        }
                        iA22 = i30;
                        int i34 = iA23;
                        gNCSNotificationInfo.priority = cursorR.getInt(i34);
                        iA23 = i34;
                        int i35 = iA24;
                        gNCSNotificationInfo.numEvents = cursorR.getInt(i35);
                        iA24 = i35;
                        int i36 = iA25;
                        gNCSNotificationInfo.isProgressUpdate = cursorR.getInt(i36);
                        iA25 = i36;
                        int i37 = iA26;
                        iA26 = i37;
                        gNCSNotificationInfo.hasLargeIcon = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i37));
                        int i38 = iA27;
                        if (cursorR.isNull(i38)) {
                            gNCSNotificationInfo.conversationId = null;
                        } else {
                            gNCSNotificationInfo.conversationId = cursorR.getString(i38);
                        }
                        iA27 = i38;
                        int i39 = iA28;
                        iA28 = i39;
                        gNCSNotificationInfo.isSuppressed = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i39));
                        int i44 = iA29;
                        gNCSNotificationInfo.numRemoteViewImages = cursorR.getInt(i44);
                        int i45 = iA30;
                        gNCSNotificationInfo.actions = gNCSNotificationDAO_Impl.__gNCSConverters.stringToActions(cursorR.isNull(i45) ? null : cursorR.getString(i45));
                        int i46 = iA31;
                        iA31 = i46;
                        gNCSNotificationInfo.images = gNCSNotificationDAO_Impl.__gNCSConverters.stringToImages(cursorR.isNull(i46) ? null : cursorR.getString(i46));
                        int i47 = iA32;
                        gNCSNotificationInfo.callType = cursorR.getInt(i47);
                        arrayList = arrayList2;
                        arrayList.add(gNCSNotificationInfo);
                        iA17 = i26;
                        iA2 = i19;
                        iA15 = i18;
                        iA18 = i27;
                        iA3 = i25;
                        iA16 = i24;
                        iA30 = i45;
                        iA29 = i44;
                        iA32 = i47;
                        iA = i15;
                    } catch (Throwable th3) {
                        th = th3;
                        cursorR.close();
                        l0Var.release();
                        throw th;
                    }
                }
                cursorR.close();
                l0Var.release();
                return arrayList;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            l0Var = l0VarE;
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public List<GNCSNotificationInfo> getNotificationsByPackage(String str) throws Throwable {
        l0 l0Var;
        GNCSNotificationDAO_Impl gNCSNotificationDAO_Impl = this;
        l0 l0VarE = l0.e(1, "SELECT * FROM notification_info WHERE packageName = ?");
        if (str == null) {
            l0VarE.u(1);
        } else {
            l0VarE.r(1, str);
        }
        gNCSNotificationDAO_Impl.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(gNCSNotificationDAO_Impl.__db, l0VarE);
        try {
            int iA = a.a(cursorR, "status");
            int iA2 = a.a(cursorR, "statusTimestamp");
            int iA3 = a.a(cursorR, "title");
            int iA4 = a.a(cursorR, "subTitle");
            int iA5 = a.a(cursorR, "message");
            int iA6 = a.a(cursorR, "positiveAction");
            int iA7 = a.a(cursorR, "negativeAction");
            int iA8 = a.a(cursorR, "phoneNumber");
            int iA9 = a.a(cursorR, "cacheKey");
            int iA10 = a.a(cursorR, "cacheId");
            int iA11 = a.a(cursorR, "notificationKey");
            int iA12 = a.a(cursorR, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            int iA13 = a.a(cursorR, "groupKey");
            l0Var = l0VarE;
            try {
                int iA14 = a.a(cursorR, NotificationConstants.KEY_DATA_MIME_TYPE);
                int iA15 = a.a(cursorR, "postTime");
                int iA16 = a.a(cursorR, "when");
                int iA17 = a.a(cursorR, "positiveActionIndex");
                int iA18 = a.a(cursorR, "negativeActionIndex");
                int iA19 = a.a(cursorR, "notificationFlags");
                int iA20 = a.a(cursorR, "eventFlags");
                int iA21 = a.a(cursorR, "extraFlags");
                int iA22 = a.a(cursorR, "category");
                int iA23 = a.a(cursorR, "priority");
                int iA24 = a.a(cursorR, "numEvents");
                int iA25 = a.a(cursorR, "isProgressUpdate");
                int iA26 = a.a(cursorR, "hasLargeIcon");
                int iA27 = a.a(cursorR, "conversationId");
                int iA28 = a.a(cursorR, "isSuppressed");
                int iA29 = a.a(cursorR, "numRemoteViewImages");
                int iA30 = a.a(cursorR, "actions");
                int iA31 = a.a(cursorR, "images");
                int iA32 = a.a(cursorR, "callType");
                int i14 = iA13;
                ArrayList arrayList = new ArrayList(cursorR.getCount());
                while (cursorR.moveToNext()) {
                    GNCSNotificationInfo gNCSNotificationInfo = new GNCSNotificationInfo();
                    ArrayList arrayList2 = arrayList;
                    int i15 = iA;
                    gNCSNotificationInfo.status = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationStatusValue(cursorR.isNull(iA) ? null : cursorR.getString(iA));
                    try {
                        gNCSNotificationInfo.statusTimestamp = cursorR.getLong(iA2);
                        if (cursorR.isNull(iA3)) {
                            gNCSNotificationInfo.title = null;
                        } else {
                            gNCSNotificationInfo.title = cursorR.getString(iA3);
                        }
                        if (cursorR.isNull(iA4)) {
                            gNCSNotificationInfo.subTitle = null;
                        } else {
                            gNCSNotificationInfo.subTitle = cursorR.getString(iA4);
                        }
                        if (cursorR.isNull(iA5)) {
                            gNCSNotificationInfo.message = null;
                        } else {
                            gNCSNotificationInfo.message = cursorR.getString(iA5);
                        }
                        if (cursorR.isNull(iA6)) {
                            gNCSNotificationInfo.positiveAction = null;
                        } else {
                            gNCSNotificationInfo.positiveAction = cursorR.getString(iA6);
                        }
                        if (cursorR.isNull(iA7)) {
                            gNCSNotificationInfo.negativeAction = null;
                        } else {
                            gNCSNotificationInfo.negativeAction = cursorR.getString(iA7);
                        }
                        if (cursorR.isNull(iA8)) {
                            gNCSNotificationInfo.phoneNumber = null;
                        } else {
                            gNCSNotificationInfo.phoneNumber = cursorR.getString(iA8);
                        }
                        if (cursorR.isNull(iA9)) {
                            gNCSNotificationInfo.cacheKey = null;
                        } else {
                            gNCSNotificationInfo.cacheKey = cursorR.getString(iA9);
                        }
                        gNCSNotificationInfo.cacheId = cursorR.getLong(iA10);
                        if (cursorR.isNull(iA11)) {
                            gNCSNotificationInfo.notificationKey = null;
                        } else {
                            gNCSNotificationInfo.notificationKey = cursorR.getString(iA11);
                        }
                        if (cursorR.isNull(iA12)) {
                            gNCSNotificationInfo.packageName = null;
                        } else {
                            gNCSNotificationInfo.packageName = cursorR.getString(iA12);
                        }
                        int i16 = i14;
                        if (cursorR.isNull(i16)) {
                            gNCSNotificationInfo.groupKey = null;
                        } else {
                            gNCSNotificationInfo.groupKey = cursorR.getString(i16);
                        }
                        int i17 = iA14;
                        String string = cursorR.isNull(i17) ? null : cursorR.getString(i17);
                        i14 = i16;
                        iA14 = i17;
                        gNCSNotificationDAO_Impl = this;
                        gNCSNotificationInfo.type = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationTypeValue(string);
                        int i18 = iA15;
                        int i19 = iA2;
                        gNCSNotificationInfo.postTime = cursorR.getLong(i18);
                        int i24 = iA16;
                        int i25 = iA3;
                        gNCSNotificationInfo.when = cursorR.getLong(i24);
                        int i26 = iA17;
                        gNCSNotificationInfo.positiveActionIndex = cursorR.getInt(i26);
                        int i27 = iA18;
                        gNCSNotificationInfo.negativeActionIndex = cursorR.getInt(i27);
                        int i28 = iA19;
                        gNCSNotificationInfo.notificationFlags = cursorR.getInt(i28);
                        iA19 = i28;
                        int i29 = iA20;
                        gNCSNotificationInfo.eventFlags = cursorR.getInt(i29);
                        iA20 = i29;
                        iA21 = iA21;
                        gNCSNotificationInfo.extraFlags = cursorR.getInt(iA21);
                        int i30 = iA22;
                        if (cursorR.isNull(i30)) {
                            gNCSNotificationInfo.category = null;
                        } else {
                            gNCSNotificationInfo.category = cursorR.getString(i30);
                        }
                        iA22 = i30;
                        int i34 = iA23;
                        gNCSNotificationInfo.priority = cursorR.getInt(i34);
                        iA23 = i34;
                        int i35 = iA24;
                        gNCSNotificationInfo.numEvents = cursorR.getInt(i35);
                        iA24 = i35;
                        int i36 = iA25;
                        gNCSNotificationInfo.isProgressUpdate = cursorR.getInt(i36);
                        iA25 = i36;
                        int i37 = iA26;
                        iA26 = i37;
                        gNCSNotificationInfo.hasLargeIcon = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i37));
                        int i38 = iA27;
                        if (cursorR.isNull(i38)) {
                            gNCSNotificationInfo.conversationId = null;
                        } else {
                            gNCSNotificationInfo.conversationId = cursorR.getString(i38);
                        }
                        iA27 = i38;
                        int i39 = iA28;
                        iA28 = i39;
                        gNCSNotificationInfo.isSuppressed = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i39));
                        int i44 = iA29;
                        gNCSNotificationInfo.numRemoteViewImages = cursorR.getInt(i44);
                        int i45 = iA30;
                        gNCSNotificationInfo.actions = gNCSNotificationDAO_Impl.__gNCSConverters.stringToActions(cursorR.isNull(i45) ? null : cursorR.getString(i45));
                        int i46 = iA31;
                        iA31 = i46;
                        gNCSNotificationInfo.images = gNCSNotificationDAO_Impl.__gNCSConverters.stringToImages(cursorR.isNull(i46) ? null : cursorR.getString(i46));
                        int i47 = iA32;
                        gNCSNotificationInfo.callType = cursorR.getInt(i47);
                        arrayList = arrayList2;
                        arrayList.add(gNCSNotificationInfo);
                        iA17 = i26;
                        iA2 = i19;
                        iA15 = i18;
                        iA18 = i27;
                        iA3 = i25;
                        iA16 = i24;
                        iA30 = i45;
                        iA29 = i44;
                        iA32 = i47;
                        iA = i15;
                    } catch (Throwable th3) {
                        th = th3;
                        cursorR.close();
                        l0Var.release();
                        throw th;
                    }
                }
                cursorR.close();
                l0Var.release();
                return arrayList;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            l0Var = l0VarE;
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public int getNumberOfEvents(GNCSNotificationInfo.NotificationType notificationType) {
        l0 l0VarE = l0.e(1, "SELECT SUM(numEvents) FROM notification_info WHERE type = ?");
        String notificationType2 = this.__gNCSConverters.toNotificationType(notificationType);
        if (notificationType2 == null) {
            l0VarE.u(1);
        } else {
            l0VarE.r(1, notificationType2);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(this.__db, l0VarE);
        try {
            return cursorR.moveToFirst() ? cursorR.getInt(0) : 0;
        } finally {
            cursorR.close();
            l0VarE.release();
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public List<GNCSNotificationInfo> getRemovedNotifications() throws Throwable {
        l0 l0Var;
        GNCSNotificationDAO_Impl gNCSNotificationDAO_Impl = this;
        l0 l0VarE = l0.e(0, "SELECT * FROM notification_info WHERE status = 'REMOVED'");
        gNCSNotificationDAO_Impl.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(gNCSNotificationDAO_Impl.__db, l0VarE);
        try {
            int iA = a.a(cursorR, "status");
            int iA2 = a.a(cursorR, "statusTimestamp");
            int iA3 = a.a(cursorR, "title");
            int iA4 = a.a(cursorR, "subTitle");
            int iA5 = a.a(cursorR, "message");
            int iA6 = a.a(cursorR, "positiveAction");
            int iA7 = a.a(cursorR, "negativeAction");
            int iA8 = a.a(cursorR, "phoneNumber");
            int iA9 = a.a(cursorR, "cacheKey");
            int iA10 = a.a(cursorR, "cacheId");
            int iA11 = a.a(cursorR, "notificationKey");
            int iA12 = a.a(cursorR, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            int iA13 = a.a(cursorR, "groupKey");
            l0Var = l0VarE;
            try {
                int iA14 = a.a(cursorR, NotificationConstants.KEY_DATA_MIME_TYPE);
                int iA15 = a.a(cursorR, "postTime");
                int iA16 = a.a(cursorR, "when");
                int iA17 = a.a(cursorR, "positiveActionIndex");
                int iA18 = a.a(cursorR, "negativeActionIndex");
                int iA19 = a.a(cursorR, "notificationFlags");
                int iA20 = a.a(cursorR, "eventFlags");
                int iA21 = a.a(cursorR, "extraFlags");
                int iA22 = a.a(cursorR, "category");
                int iA23 = a.a(cursorR, "priority");
                int iA24 = a.a(cursorR, "numEvents");
                int iA25 = a.a(cursorR, "isProgressUpdate");
                int iA26 = a.a(cursorR, "hasLargeIcon");
                int iA27 = a.a(cursorR, "conversationId");
                int iA28 = a.a(cursorR, "isSuppressed");
                int iA29 = a.a(cursorR, "numRemoteViewImages");
                int iA30 = a.a(cursorR, "actions");
                int iA31 = a.a(cursorR, "images");
                int iA32 = a.a(cursorR, "callType");
                int i14 = iA13;
                ArrayList arrayList = new ArrayList(cursorR.getCount());
                while (cursorR.moveToNext()) {
                    GNCSNotificationInfo gNCSNotificationInfo = new GNCSNotificationInfo();
                    ArrayList arrayList2 = arrayList;
                    int i15 = iA;
                    gNCSNotificationInfo.status = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationStatusValue(cursorR.isNull(iA) ? null : cursorR.getString(iA));
                    try {
                        gNCSNotificationInfo.statusTimestamp = cursorR.getLong(iA2);
                        if (cursorR.isNull(iA3)) {
                            gNCSNotificationInfo.title = null;
                        } else {
                            gNCSNotificationInfo.title = cursorR.getString(iA3);
                        }
                        if (cursorR.isNull(iA4)) {
                            gNCSNotificationInfo.subTitle = null;
                        } else {
                            gNCSNotificationInfo.subTitle = cursorR.getString(iA4);
                        }
                        if (cursorR.isNull(iA5)) {
                            gNCSNotificationInfo.message = null;
                        } else {
                            gNCSNotificationInfo.message = cursorR.getString(iA5);
                        }
                        if (cursorR.isNull(iA6)) {
                            gNCSNotificationInfo.positiveAction = null;
                        } else {
                            gNCSNotificationInfo.positiveAction = cursorR.getString(iA6);
                        }
                        if (cursorR.isNull(iA7)) {
                            gNCSNotificationInfo.negativeAction = null;
                        } else {
                            gNCSNotificationInfo.negativeAction = cursorR.getString(iA7);
                        }
                        if (cursorR.isNull(iA8)) {
                            gNCSNotificationInfo.phoneNumber = null;
                        } else {
                            gNCSNotificationInfo.phoneNumber = cursorR.getString(iA8);
                        }
                        if (cursorR.isNull(iA9)) {
                            gNCSNotificationInfo.cacheKey = null;
                        } else {
                            gNCSNotificationInfo.cacheKey = cursorR.getString(iA9);
                        }
                        gNCSNotificationInfo.cacheId = cursorR.getLong(iA10);
                        if (cursorR.isNull(iA11)) {
                            gNCSNotificationInfo.notificationKey = null;
                        } else {
                            gNCSNotificationInfo.notificationKey = cursorR.getString(iA11);
                        }
                        if (cursorR.isNull(iA12)) {
                            gNCSNotificationInfo.packageName = null;
                        } else {
                            gNCSNotificationInfo.packageName = cursorR.getString(iA12);
                        }
                        int i16 = i14;
                        if (cursorR.isNull(i16)) {
                            gNCSNotificationInfo.groupKey = null;
                        } else {
                            gNCSNotificationInfo.groupKey = cursorR.getString(i16);
                        }
                        int i17 = iA14;
                        String string = cursorR.isNull(i17) ? null : cursorR.getString(i17);
                        i14 = i16;
                        iA14 = i17;
                        gNCSNotificationDAO_Impl = this;
                        gNCSNotificationInfo.type = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationTypeValue(string);
                        int i18 = iA2;
                        int i19 = iA15;
                        int i24 = iA3;
                        gNCSNotificationInfo.postTime = cursorR.getLong(i19);
                        int i25 = iA16;
                        int i26 = iA4;
                        gNCSNotificationInfo.when = cursorR.getLong(i25);
                        int i27 = iA17;
                        gNCSNotificationInfo.positiveActionIndex = cursorR.getInt(i27);
                        int i28 = iA18;
                        gNCSNotificationInfo.negativeActionIndex = cursorR.getInt(i28);
                        int i29 = iA19;
                        gNCSNotificationInfo.notificationFlags = cursorR.getInt(i29);
                        iA19 = i29;
                        int i30 = iA20;
                        gNCSNotificationInfo.eventFlags = cursorR.getInt(i30);
                        iA20 = i30;
                        iA21 = iA21;
                        gNCSNotificationInfo.extraFlags = cursorR.getInt(iA21);
                        int i34 = iA22;
                        if (cursorR.isNull(i34)) {
                            gNCSNotificationInfo.category = null;
                        } else {
                            gNCSNotificationInfo.category = cursorR.getString(i34);
                        }
                        iA22 = i34;
                        int i35 = iA23;
                        gNCSNotificationInfo.priority = cursorR.getInt(i35);
                        iA23 = i35;
                        int i36 = iA24;
                        gNCSNotificationInfo.numEvents = cursorR.getInt(i36);
                        iA24 = i36;
                        int i37 = iA25;
                        gNCSNotificationInfo.isProgressUpdate = cursorR.getInt(i37);
                        iA25 = i37;
                        int i38 = iA26;
                        iA26 = i38;
                        gNCSNotificationInfo.hasLargeIcon = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i38));
                        int i39 = iA27;
                        if (cursorR.isNull(i39)) {
                            gNCSNotificationInfo.conversationId = null;
                        } else {
                            gNCSNotificationInfo.conversationId = cursorR.getString(i39);
                        }
                        iA27 = i39;
                        int i44 = iA28;
                        iA28 = i44;
                        gNCSNotificationInfo.isSuppressed = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i44));
                        int i45 = iA29;
                        gNCSNotificationInfo.numRemoteViewImages = cursorR.getInt(i45);
                        int i46 = iA30;
                        gNCSNotificationInfo.actions = gNCSNotificationDAO_Impl.__gNCSConverters.stringToActions(cursorR.isNull(i46) ? null : cursorR.getString(i46));
                        int i47 = iA31;
                        iA31 = i47;
                        gNCSNotificationInfo.images = gNCSNotificationDAO_Impl.__gNCSConverters.stringToImages(cursorR.isNull(i47) ? null : cursorR.getString(i47));
                        int i48 = iA32;
                        gNCSNotificationInfo.callType = cursorR.getInt(i48);
                        arrayList = arrayList2;
                        arrayList.add(gNCSNotificationInfo);
                        iA16 = i25;
                        iA2 = i18;
                        iA18 = i28;
                        iA4 = i26;
                        iA17 = i27;
                        iA3 = i24;
                        iA15 = i19;
                        iA30 = i46;
                        iA29 = i45;
                        iA32 = i48;
                        iA = i15;
                    } catch (Throwable th3) {
                        th = th3;
                        cursorR.close();
                        l0Var.release();
                        throw th;
                    }
                }
                cursorR.close();
                l0Var.release();
                return arrayList;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            l0Var = l0VarE;
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public void removeNotification(GNCSNotificationInfo gNCSNotificationInfo) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfGNCSNotificationInfo.handle(gNCSNotificationInfo);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public void removeNotifications(GNCSNotificationInfo.NotificationType notificationType) {
        this.__db.assertNotSuspendingTransaction();
        g gVarAcquire = this.__preparedStmtOfRemoveNotifications.acquire();
        String notificationType2 = this.__gNCSConverters.toNotificationType(notificationType);
        if (notificationType2 == null) {
            gVarAcquire.u(1);
        } else {
            gVarAcquire.r(1, notificationType2);
        }
        this.__db.beginTransaction();
        try {
            gVarAcquire.b2();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemoveNotifications.release(gVarAcquire);
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public void removeStaleNotifications(long j8) {
        this.__db.assertNotSuspendingTransaction();
        g gVarAcquire = this.__preparedStmtOfRemoveStaleNotifications.acquire();
        gVarAcquire.h(1, j8);
        this.__db.beginTransaction();
        try {
            gVarAcquire.b2();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemoveStaleNotifications.release(gVarAcquire);
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public void saveNotification(GNCSNotificationInfo gNCSNotificationInfo) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfGNCSNotificationInfo.insert(gNCSNotificationInfo);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public GNCSNotificationInfo getNotification(long j8) throws Throwable {
        l0 l0Var;
        GNCSNotificationInfo gNCSNotificationInfo;
        String str;
        l0 l0VarE = l0.e(1, "SELECT * FROM notification_info WHERE cacheId = ?");
        l0VarE.h(1, j8);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(this.__db, l0VarE);
        try {
            int iA = a.a(cursorR, "status");
            int iA2 = a.a(cursorR, "statusTimestamp");
            int iA3 = a.a(cursorR, "title");
            int iA4 = a.a(cursorR, "subTitle");
            int iA5 = a.a(cursorR, "message");
            int iA6 = a.a(cursorR, "positiveAction");
            int iA7 = a.a(cursorR, "negativeAction");
            int iA8 = a.a(cursorR, "phoneNumber");
            int iA9 = a.a(cursorR, "cacheKey");
            int iA10 = a.a(cursorR, "cacheId");
            int iA11 = a.a(cursorR, "notificationKey");
            int iA12 = a.a(cursorR, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            int iA13 = a.a(cursorR, "groupKey");
            l0Var = l0VarE;
            try {
                int iA14 = a.a(cursorR, NotificationConstants.KEY_DATA_MIME_TYPE);
                int iA15 = a.a(cursorR, "postTime");
                int iA16 = a.a(cursorR, "when");
                int iA17 = a.a(cursorR, "positiveActionIndex");
                int iA18 = a.a(cursorR, "negativeActionIndex");
                int iA19 = a.a(cursorR, "notificationFlags");
                int iA20 = a.a(cursorR, "eventFlags");
                int iA21 = a.a(cursorR, "extraFlags");
                int iA22 = a.a(cursorR, "category");
                int iA23 = a.a(cursorR, "priority");
                int iA24 = a.a(cursorR, "numEvents");
                int iA25 = a.a(cursorR, "isProgressUpdate");
                int iA26 = a.a(cursorR, "hasLargeIcon");
                int iA27 = a.a(cursorR, "conversationId");
                int iA28 = a.a(cursorR, "isSuppressed");
                int iA29 = a.a(cursorR, "numRemoteViewImages");
                int iA30 = a.a(cursorR, "actions");
                int iA31 = a.a(cursorR, "images");
                int iA32 = a.a(cursorR, "callType");
                if (cursorR.moveToFirst()) {
                    gNCSNotificationInfo = new GNCSNotificationInfo();
                    gNCSNotificationInfo.status = this.__gNCSConverters.fromNotificationStatusValue(cursorR.isNull(iA) ? null : cursorR.getString(iA));
                    try {
                        gNCSNotificationInfo.statusTimestamp = cursorR.getLong(iA2);
                        if (cursorR.isNull(iA3)) {
                            gNCSNotificationInfo.title = null;
                        } else {
                            gNCSNotificationInfo.title = cursorR.getString(iA3);
                        }
                        if (cursorR.isNull(iA4)) {
                            gNCSNotificationInfo.subTitle = null;
                        } else {
                            gNCSNotificationInfo.subTitle = cursorR.getString(iA4);
                        }
                        if (cursorR.isNull(iA5)) {
                            gNCSNotificationInfo.message = null;
                        } else {
                            gNCSNotificationInfo.message = cursorR.getString(iA5);
                        }
                        if (cursorR.isNull(iA6)) {
                            gNCSNotificationInfo.positiveAction = null;
                        } else {
                            gNCSNotificationInfo.positiveAction = cursorR.getString(iA6);
                        }
                        if (cursorR.isNull(iA7)) {
                            gNCSNotificationInfo.negativeAction = null;
                        } else {
                            gNCSNotificationInfo.negativeAction = cursorR.getString(iA7);
                        }
                        if (cursorR.isNull(iA8)) {
                            gNCSNotificationInfo.phoneNumber = null;
                        } else {
                            gNCSNotificationInfo.phoneNumber = cursorR.getString(iA8);
                        }
                        if (cursorR.isNull(iA9)) {
                            gNCSNotificationInfo.cacheKey = null;
                        } else {
                            gNCSNotificationInfo.cacheKey = cursorR.getString(iA9);
                        }
                        gNCSNotificationInfo.cacheId = cursorR.getLong(iA10);
                        if (cursorR.isNull(iA11)) {
                            gNCSNotificationInfo.notificationKey = null;
                        } else {
                            gNCSNotificationInfo.notificationKey = cursorR.getString(iA11);
                        }
                        if (cursorR.isNull(iA12)) {
                            gNCSNotificationInfo.packageName = null;
                        } else {
                            gNCSNotificationInfo.packageName = cursorR.getString(iA12);
                        }
                        if (cursorR.isNull(iA13)) {
                            gNCSNotificationInfo.groupKey = null;
                        } else {
                            gNCSNotificationInfo.groupKey = cursorR.getString(iA13);
                        }
                        gNCSNotificationInfo.type = this.__gNCSConverters.fromNotificationTypeValue(cursorR.isNull(iA14) ? null : cursorR.getString(iA14));
                        gNCSNotificationInfo.postTime = cursorR.getLong(iA15);
                        gNCSNotificationInfo.when = cursorR.getLong(iA16);
                        gNCSNotificationInfo.positiveActionIndex = cursorR.getInt(iA17);
                        gNCSNotificationInfo.negativeActionIndex = cursorR.getInt(iA18);
                        gNCSNotificationInfo.notificationFlags = cursorR.getInt(iA19);
                        gNCSNotificationInfo.eventFlags = cursorR.getInt(iA20);
                        gNCSNotificationInfo.extraFlags = cursorR.getInt(iA21);
                        if (cursorR.isNull(iA22)) {
                            gNCSNotificationInfo.category = null;
                        } else {
                            gNCSNotificationInfo.category = cursorR.getString(iA22);
                        }
                        gNCSNotificationInfo.priority = cursorR.getInt(iA23);
                        gNCSNotificationInfo.numEvents = cursorR.getInt(iA24);
                        gNCSNotificationInfo.isProgressUpdate = cursorR.getInt(iA25);
                        gNCSNotificationInfo.hasLargeIcon = this.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(iA26));
                        if (cursorR.isNull(iA27)) {
                            str = null;
                            gNCSNotificationInfo.conversationId = null;
                        } else {
                            str = null;
                            gNCSNotificationInfo.conversationId = cursorR.getString(iA27);
                        }
                        gNCSNotificationInfo.isSuppressed = this.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(iA28));
                        gNCSNotificationInfo.numRemoteViewImages = cursorR.getInt(iA29);
                        gNCSNotificationInfo.actions = this.__gNCSConverters.stringToActions(cursorR.isNull(iA30) ? str : cursorR.getString(iA30));
                        gNCSNotificationInfo.images = this.__gNCSConverters.stringToImages(cursorR.isNull(iA31) ? str : cursorR.getString(iA31));
                        gNCSNotificationInfo.callType = cursorR.getInt(iA32);
                    } catch (Throwable th3) {
                        th = th3;
                        cursorR.close();
                        l0Var.release();
                        throw th;
                    }
                } else {
                    gNCSNotificationInfo = null;
                }
                cursorR.close();
                l0Var.release();
                return gNCSNotificationInfo;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            l0Var = l0VarE;
        }
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDAO
    public List<GNCSNotificationInfo> getActiveNotifications() throws Throwable {
        l0 l0Var;
        GNCSNotificationDAO_Impl gNCSNotificationDAO_Impl = this;
        l0 l0VarE = l0.e(0, "SELECT * FROM notification_info WHERE status IN ('NEW', 'NEW_SILENT', 'UPDATED')");
        gNCSNotificationDAO_Impl.__db.assertNotSuspendingTransaction();
        Cursor cursorR = d.R(gNCSNotificationDAO_Impl.__db, l0VarE);
        try {
            int iA = a.a(cursorR, "status");
            int iA2 = a.a(cursorR, "statusTimestamp");
            int iA3 = a.a(cursorR, "title");
            int iA4 = a.a(cursorR, "subTitle");
            int iA5 = a.a(cursorR, "message");
            int iA6 = a.a(cursorR, "positiveAction");
            int iA7 = a.a(cursorR, "negativeAction");
            int iA8 = a.a(cursorR, "phoneNumber");
            int iA9 = a.a(cursorR, "cacheKey");
            int iA10 = a.a(cursorR, "cacheId");
            int iA11 = a.a(cursorR, "notificationKey");
            int iA12 = a.a(cursorR, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            int iA13 = a.a(cursorR, "groupKey");
            l0Var = l0VarE;
            try {
                int iA14 = a.a(cursorR, NotificationConstants.KEY_DATA_MIME_TYPE);
                int iA15 = a.a(cursorR, "postTime");
                int iA16 = a.a(cursorR, "when");
                int iA17 = a.a(cursorR, "positiveActionIndex");
                int iA18 = a.a(cursorR, "negativeActionIndex");
                int iA19 = a.a(cursorR, "notificationFlags");
                int iA20 = a.a(cursorR, "eventFlags");
                int iA21 = a.a(cursorR, "extraFlags");
                int iA22 = a.a(cursorR, "category");
                int iA23 = a.a(cursorR, "priority");
                int iA24 = a.a(cursorR, "numEvents");
                int iA25 = a.a(cursorR, "isProgressUpdate");
                int iA26 = a.a(cursorR, "hasLargeIcon");
                int iA27 = a.a(cursorR, "conversationId");
                int iA28 = a.a(cursorR, "isSuppressed");
                int iA29 = a.a(cursorR, "numRemoteViewImages");
                int iA30 = a.a(cursorR, "actions");
                int iA31 = a.a(cursorR, "images");
                int iA32 = a.a(cursorR, "callType");
                int i14 = iA13;
                ArrayList arrayList = new ArrayList(cursorR.getCount());
                while (cursorR.moveToNext()) {
                    GNCSNotificationInfo gNCSNotificationInfo = new GNCSNotificationInfo();
                    ArrayList arrayList2 = arrayList;
                    int i15 = iA;
                    gNCSNotificationInfo.status = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationStatusValue(cursorR.isNull(iA) ? null : cursorR.getString(iA));
                    try {
                        gNCSNotificationInfo.statusTimestamp = cursorR.getLong(iA2);
                        if (cursorR.isNull(iA3)) {
                            gNCSNotificationInfo.title = null;
                        } else {
                            gNCSNotificationInfo.title = cursorR.getString(iA3);
                        }
                        if (cursorR.isNull(iA4)) {
                            gNCSNotificationInfo.subTitle = null;
                        } else {
                            gNCSNotificationInfo.subTitle = cursorR.getString(iA4);
                        }
                        if (cursorR.isNull(iA5)) {
                            gNCSNotificationInfo.message = null;
                        } else {
                            gNCSNotificationInfo.message = cursorR.getString(iA5);
                        }
                        if (cursorR.isNull(iA6)) {
                            gNCSNotificationInfo.positiveAction = null;
                        } else {
                            gNCSNotificationInfo.positiveAction = cursorR.getString(iA6);
                        }
                        if (cursorR.isNull(iA7)) {
                            gNCSNotificationInfo.negativeAction = null;
                        } else {
                            gNCSNotificationInfo.negativeAction = cursorR.getString(iA7);
                        }
                        if (cursorR.isNull(iA8)) {
                            gNCSNotificationInfo.phoneNumber = null;
                        } else {
                            gNCSNotificationInfo.phoneNumber = cursorR.getString(iA8);
                        }
                        if (cursorR.isNull(iA9)) {
                            gNCSNotificationInfo.cacheKey = null;
                        } else {
                            gNCSNotificationInfo.cacheKey = cursorR.getString(iA9);
                        }
                        gNCSNotificationInfo.cacheId = cursorR.getLong(iA10);
                        if (cursorR.isNull(iA11)) {
                            gNCSNotificationInfo.notificationKey = null;
                        } else {
                            gNCSNotificationInfo.notificationKey = cursorR.getString(iA11);
                        }
                        if (cursorR.isNull(iA12)) {
                            gNCSNotificationInfo.packageName = null;
                        } else {
                            gNCSNotificationInfo.packageName = cursorR.getString(iA12);
                        }
                        int i16 = i14;
                        if (cursorR.isNull(i16)) {
                            gNCSNotificationInfo.groupKey = null;
                        } else {
                            gNCSNotificationInfo.groupKey = cursorR.getString(i16);
                        }
                        int i17 = iA14;
                        String string = cursorR.isNull(i17) ? null : cursorR.getString(i17);
                        i14 = i16;
                        iA14 = i17;
                        gNCSNotificationDAO_Impl = this;
                        gNCSNotificationInfo.type = gNCSNotificationDAO_Impl.__gNCSConverters.fromNotificationTypeValue(string);
                        int i18 = iA2;
                        int i19 = iA15;
                        int i24 = iA3;
                        gNCSNotificationInfo.postTime = cursorR.getLong(i19);
                        int i25 = iA16;
                        int i26 = iA4;
                        gNCSNotificationInfo.when = cursorR.getLong(i25);
                        int i27 = iA17;
                        gNCSNotificationInfo.positiveActionIndex = cursorR.getInt(i27);
                        int i28 = iA18;
                        gNCSNotificationInfo.negativeActionIndex = cursorR.getInt(i28);
                        int i29 = iA19;
                        gNCSNotificationInfo.notificationFlags = cursorR.getInt(i29);
                        iA19 = i29;
                        int i30 = iA20;
                        gNCSNotificationInfo.eventFlags = cursorR.getInt(i30);
                        iA20 = i30;
                        iA21 = iA21;
                        gNCSNotificationInfo.extraFlags = cursorR.getInt(iA21);
                        int i34 = iA22;
                        if (cursorR.isNull(i34)) {
                            gNCSNotificationInfo.category = null;
                        } else {
                            gNCSNotificationInfo.category = cursorR.getString(i34);
                        }
                        iA22 = i34;
                        int i35 = iA23;
                        gNCSNotificationInfo.priority = cursorR.getInt(i35);
                        iA23 = i35;
                        int i36 = iA24;
                        gNCSNotificationInfo.numEvents = cursorR.getInt(i36);
                        iA24 = i36;
                        int i37 = iA25;
                        gNCSNotificationInfo.isProgressUpdate = cursorR.getInt(i37);
                        iA25 = i37;
                        int i38 = iA26;
                        iA26 = i38;
                        gNCSNotificationInfo.hasLargeIcon = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i38));
                        int i39 = iA27;
                        if (cursorR.isNull(i39)) {
                            gNCSNotificationInfo.conversationId = null;
                        } else {
                            gNCSNotificationInfo.conversationId = cursorR.getString(i39);
                        }
                        iA27 = i39;
                        int i44 = iA28;
                        iA28 = i44;
                        gNCSNotificationInfo.isSuppressed = gNCSNotificationDAO_Impl.__gNCSConverters.intToHasLargeIcon(cursorR.getInt(i44));
                        int i45 = iA29;
                        gNCSNotificationInfo.numRemoteViewImages = cursorR.getInt(i45);
                        int i46 = iA30;
                        gNCSNotificationInfo.actions = gNCSNotificationDAO_Impl.__gNCSConverters.stringToActions(cursorR.isNull(i46) ? null : cursorR.getString(i46));
                        int i47 = iA31;
                        iA31 = i47;
                        gNCSNotificationInfo.images = gNCSNotificationDAO_Impl.__gNCSConverters.stringToImages(cursorR.isNull(i47) ? null : cursorR.getString(i47));
                        int i48 = iA32;
                        gNCSNotificationInfo.callType = cursorR.getInt(i48);
                        arrayList = arrayList2;
                        arrayList.add(gNCSNotificationInfo);
                        iA16 = i25;
                        iA2 = i18;
                        iA18 = i28;
                        iA4 = i26;
                        iA17 = i27;
                        iA3 = i24;
                        iA15 = i19;
                        iA30 = i46;
                        iA29 = i45;
                        iA32 = i48;
                        iA = i15;
                    } catch (Throwable th3) {
                        th = th3;
                        cursorR.close();
                        l0Var.release();
                        throw th;
                    }
                }
                cursorR.close();
                l0Var.release();
                return arrayList;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            l0Var = l0VarE;
        }
    }
}
