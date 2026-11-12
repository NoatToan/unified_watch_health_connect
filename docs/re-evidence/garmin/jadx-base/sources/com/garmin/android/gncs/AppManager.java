package com.garmin.android.gncs;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import com.garmin.android.gncs.persistence.GNCSApplicationsDAO;
import com.garmin.android.gncs.persistence.GNCSApplicationsDatabase;
import com.garmin.android.gncs.persistence.contentprovider.ApplicationsContentProvider;
import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import com.garmin.android.gncs.telephony.TelephonyUtilKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.e1;
import o53.s0;
import org.json.JSONArray;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.y;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0083@¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0003J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u001cJ\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\"\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010#¨\u0006$"}, d2 = {"Lcom/garmin/android/gncs/AppManager;", "", "<init>", "()V", "", "upgradeInternal", "(Lt13/d;)Ljava/lang/Object;", "", "", "Lcom/garmin/android/gncs/GNCSApplicationInfo;", "toBlockedApps", "(Ljava/lang/String;)Ljava/util/List;", "appInfo", "", "updateContentProvider", "saveInternal", "(Lcom/garmin/android/gncs/GNCSApplicationInfo;Z)V", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "removeInternal", "(Ljava/lang/String;Z)V", "Landroid/content/Context;", "appContext", "init", "(Landroid/content/Context;)V", "upgrade", "disabledPackages", "()Ljava/util/List;", "isPackageEnabled", "(Ljava/lang/String;)Z", "save", "(Lcom/garmin/android/gncs/GNCSApplicationInfo;)V", "enable", "(Ljava/lang/String;)V", "isDefaultDialer", "getAllApplications", "Landroid/content/Context;", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AppManager {
    public static final AppManager INSTANCE = new AppManager();
    private static Context appContext;

    /* JADX INFO: renamed from: com.garmin.android.gncs.AppManager$enable$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.gncs.AppManager$enable$1", f = "AppManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ String $packageName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$packageName = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new AnonymousClass1(this.$packageName, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            AppManager.INSTANCE.removeInternal(this.$packageName, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gncs.AppManager$save$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.gncs.AppManager$save$1", f = "AppManager.kt", l = {}, m = "invokeSuspend")
    public static final class C39021 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ GNCSApplicationInfo $appInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39021(GNCSApplicationInfo gNCSApplicationInfo, t13.d<? super C39021> dVar) {
            super(2, dVar);
            this.$appInfo = gNCSApplicationInfo;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C39021(this.$appInfo, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C39021) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            AppManager.INSTANCE.saveInternal(this.$appInfo, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gncs.AppManager$upgrade$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.gncs.AppManager$upgrade$1", f = "AppManager.kt", l = {35}, m = "invokeSuspend")
    public static final class C39031 extends i implements p<b0, t13.d<? super Unit>, Object> {
        int label;

        public C39031(t13.d<? super C39031> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C39031(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C39031) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    AppManager appManager = AppManager.INSTANCE;
                    this.label = 1;
                    if (appManager.upgradeInternal(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Throwable th3) {
                ih2.b.c("AppManager.upgrade", th3);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gncs.AppManager$upgradeInternal$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @v13.e(c = "com.garmin.android.gncs.AppManager$upgradeInternal$2", f = "AppManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p<b0, t13.d<? super Unit>, Object> {
        int label;

        public AnonymousClass2(t13.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new AnonymousClass2(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            GNCSApplicationsDAO gNCSApplicationsDAOApplicationsDAO = GNCSApplicationsDatabase.getInstance().applicationsDAO();
            if (gNCSApplicationsDAOApplicationsDAO.getApplicationCount() > 0) {
                ih2.b.b("GNCSSettings.performUpgrade -> no upgrade to perform, already converted to use DB");
                return Unit.INSTANCE;
            }
            gNCSApplicationsDAOApplicationsDAO.saveApplication(new GNCSApplicationInfo(SmartNotificationsUtil.Packages.NOTIFICATION_SETUP_INDICATOR_PACKAGE_NAME, false));
            Context context = AppManager.appContext;
            if (context == null) {
                s.m("appContext");
                throw null;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("gncs", 0);
            String string = sharedPreferences.getString("blocked_notifications", null);
            if (string != null) {
                sharedPreferences.edit().remove("blocked_notifications").commit();
                gNCSApplicationsDAOApplicationsDAO.saveApplications(AppManager.INSTANCE.toBlockedApps(string));
                ih2.b.b("GNCSSettings.performUpgrade -> not upgrading because user has already set list of apps");
            }
            return Unit.INSTANCE;
        }
    }

    private AppManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeInternal(String packageName, boolean updateContentProvider) {
        try {
            GNCSApplicationsDatabase.getInstance().applicationsDAO().removeApplication(packageName);
            if (updateContentProvider && SmartNotificationsConfig.getInstance().isSharingSettingsAcrossApps()) {
                Context context = appContext;
                if (context == null) {
                    s.m("appContext");
                    throw null;
                }
                ContentResolver contentResolver = context.getContentResolver();
                ApplicationsContentProvider.Companion companion = ApplicationsContentProvider.INSTANCE;
                Context context2 = appContext;
                if (context2 != null) {
                    contentResolver.delete(companion.getContentProviderUri(context2), null, new String[]{packageName});
                } else {
                    s.m("appContext");
                    throw null;
                }
            }
        } catch (Throwable th3) {
            ih2.b.c("AppManager.removeInternal", th3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveInternal(GNCSApplicationInfo appInfo, boolean updateContentProvider) {
        try {
            if (appInfo.enabled) {
                String str = appInfo.packageName;
                str.getClass();
                removeInternal(str, updateContentProvider);
                return;
            }
            GNCSApplicationsDatabase.getInstance().applicationsDAO().saveApplication(appInfo);
            if (updateContentProvider && SmartNotificationsConfig.getInstance().isSharingSettingsAcrossApps()) {
                Context context = appContext;
                if (context == null) {
                    s.m("appContext");
                    throw null;
                }
                ContentResolver contentResolver = context.getContentResolver();
                ApplicationsContentProvider.Companion companion = ApplicationsContentProvider.INSTANCE;
                Context context2 = appContext;
                if (context2 == null) {
                    s.m("appContext");
                    throw null;
                }
                Uri contentProviderUri = companion.getContentProviderUri(context2);
                ContentValues contentValues = new ContentValues(2);
                contentValues.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, appInfo.packageName);
                contentValues.put("enabled", Boolean.valueOf(appInfo.enabled));
                Unit unit = Unit.INSTANCE;
                contentResolver.insert(contentProviderUri, contentValues);
            }
        } catch (Throwable th3) {
            ih2.b.c("AppManager.saveInternal", th3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<GNCSApplicationInfo> toBlockedApps(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            arrayList.ensureCapacity(jSONArray.length());
            int length = jSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                arrayList.add(new GNCSApplicationInfo(jSONArray.getJSONObject(i14).getString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME), false));
            }
            return arrayList;
        } catch (Throwable th3) {
            ih2.b.c("AppManager.toBlockedApps", th3);
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ApplySharedPref"})
    public final Object upgradeInternal(t13.d<? super Unit> dVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new AnonymousClass2(null), dVar);
    }

    public final List<String> disabledPackages() {
        try {
            if (SmartNotificationsConfig.getInstance().isSharingSettingsAcrossApps()) {
                ih2.b.b("AppManager.disabledPackages -> GNCS is sharing settings across applications");
                Context context = appContext;
                if (context == null) {
                    s.m("appContext");
                    throw null;
                }
                ContentResolver contentResolver = context.getContentResolver();
                ApplicationsContentProvider.Companion companion = ApplicationsContentProvider.INSTANCE;
                Context context2 = appContext;
                if (context2 == null) {
                    s.m("appContext");
                    throw null;
                }
                Cursor cursorQuery = contentResolver.query(companion.getContentProviderUri(context2), new String[]{RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME}, "enabled != 1", null, null);
                if (cursorQuery != null) {
                    Cursor cursor = cursorQuery;
                    try {
                        Cursor cursor2 = cursor;
                        ArrayList arrayList = new ArrayList();
                        while (cursor2.moveToNext()) {
                            String string = cursor2.getString(0);
                            string.getClass();
                            arrayList.add(string);
                            ih2.b.b("AppManager.disabledPackages -> adding [" + string + "] to disabled packages");
                        }
                        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new GNCSApplicationInfo((String) it.next(), false));
                        }
                        GNCSApplicationsDatabase.getInstance().applicationsDAO().saveApplications(arrayList2);
                        cursor.close();
                        return arrayList;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jg.b.l(cursor, th3);
                            throw th4;
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            ih2.b.c("AppManager.disabledPackages", th5);
        }
        ih2.b.b("AppManager.disabledPackages -> GNCS is not sharing settings across applications");
        List<String> listDisabledPackages = GNCSApplicationsDatabase.getInstance().applicationsDAO().disabledPackages();
        listDisabledPackages.getClass();
        return listDisabledPackages;
    }

    public final void enable(String packageName) {
        packageName.getClass();
        e1 e1Var = e1.f129333a;
        x53.c cVar = s0.f129406a;
        ge1.b.T(e1Var, x53.b.f189152a, null, new AnonymousClass1(packageName, null), 2);
    }

    public final List<GNCSApplicationInfo> getAllApplications() {
        List<GNCSApplicationInfo> allApplications = GNCSApplicationsDatabase.getInstance().applicationsDAO().getAllApplications();
        allApplications.getClass();
        return allApplications;
    }

    public final void init(Context appContext2) {
        appContext2.getClass();
        appContext = appContext2;
    }

    public final boolean isDefaultDialer(String packageName) {
        packageName.getClass();
        Context context = appContext;
        if (context != null) {
            return s.g(TelephonyUtilKt.getDefaultDialerPackage(context), packageName);
        }
        s.m("appContext");
        throw null;
    }

    public final boolean isPackageEnabled(String packageName) {
        packageName.getClass();
        boolean z14 = false;
        try {
            if (SmartNotificationsConfig.getInstance().isSharingSettingsAcrossApps()) {
                Context context = appContext;
                if (context == null) {
                    s.m("appContext");
                    throw null;
                }
                ContentResolver contentResolver = context.getContentResolver();
                ApplicationsContentProvider.Companion companion = ApplicationsContentProvider.INSTANCE;
                Context context2 = appContext;
                if (context2 == null) {
                    s.m("appContext");
                    throw null;
                }
                Cursor cursorQuery = contentResolver.query(companion.getContentProviderUri(context2), new String[]{"enabled"}, "packageName = ?", new String[]{packageName}, null);
                if (cursorQuery != null) {
                    Cursor cursor = cursorQuery;
                    try {
                        Cursor cursor2 = cursor;
                        boolean z15 = !cursor2.moveToFirst() || cursor2.getInt(0) == 1;
                        INSTANCE.saveInternal(new GNCSApplicationInfo(packageName, z15), false);
                        cursor.close();
                        return z15;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jg.b.l(cursor, th3);
                            throw th4;
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            ih2.b.c("AppManager.isPackageEnabled", th5);
        }
        GNCSApplicationInfo applicationInfo = GNCSApplicationsDatabase.getInstance().applicationsDAO().getApplicationInfo(packageName);
        if (applicationInfo != null && !applicationInfo.enabled) {
            z14 = true;
        }
        return !z14;
    }

    public final void save(GNCSApplicationInfo appInfo) {
        appInfo.getClass();
        e1 e1Var = e1.f129333a;
        x53.c cVar = s0.f129406a;
        ge1.b.T(e1Var, x53.b.f189152a, null, new C39021(appInfo, null), 2);
    }

    public final void upgrade() {
        ge1.b.T(e1.f129333a, null, null, new C39031(null), 3);
    }
}
