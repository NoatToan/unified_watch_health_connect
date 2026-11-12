package com.garmin.android.gncs.persistence.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import com.garmin.android.gncs.GNCSApplicationInfo;
import com.garmin.android.gncs.persistence.GNCSApplicationsDatabase;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import ih2.b;
import java.util.Iterator;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u;
import p13.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016JO\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u0016J;\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u0018J\f\u0010\u0019\u001a\u00020\u0011*\u00020\u0006H\u0002¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/gncs/persistence/contentprovider/ApplicationsContentProvider;", "Landroid/content/ContentProvider;", "()V", "delete", "", "uri", "Landroid/net/Uri;", "selection", "", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "insert", "values", "Landroid/content/ContentValues;", "onCreate", "", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "isValid", "Companion", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ApplicationsContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    private final boolean isValid(Uri uri) {
        String authority = uri.getAuthority();
        return authority != null && authority.endsWith(".gncs.ApplicationsContentProvider");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        uri.getClass();
        if (!isValid(uri) || selectionArgs == null || selectionArgs.length == 0) {
            return 0;
        }
        try {
            int i14 = 0;
            for (String str : selectionArgs) {
                try {
                    b.b("ApplicationsContentProvider.delete -> removing package [" + str + "] from disabled apps");
                    GNCSApplicationsDatabase.getInstance().applicationsDAO().removeApplication(str);
                    i14++;
                } catch (Throwable unused) {
                    return i14;
                }
            }
            return i14;
        } catch (Throwable unused2) {
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        String asString;
        Boolean asBoolean;
        uri.getClass();
        if (!isValid(uri)) {
            return null;
        }
        if (values != null) {
            try {
                asString = values.getAsString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            } catch (Throwable unused) {
                return null;
            }
        } else {
            asString = null;
        }
        if (asString == null || (asBoolean = values.getAsBoolean("enabled")) == null) {
            return null;
        }
        boolean zBooleanValue = asBoolean.booleanValue();
        b.b("ApplicationsContentProvider.insert -> insert package [" + asString + "] as enabled " + zBooleanValue);
        GNCSApplicationsDatabase.getInstance().applicationsDAO().saveApplication(new GNCSApplicationInfo(asString, zBooleanValue));
        return uri.buildUpon().appendPath(asString).build();
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        uri.getClass();
        if (!isValid(uri) || selection == null || selection.length() == 0) {
            return null;
        }
        try {
            return GNCSApplicationsDatabase.getInstance().query("SELECT " + (projection != null ? u.P(projection, ", ", null, null, null, 62) : Marker.ANY_MARKER) + " FROM application_info WHERE " + selection, selectionArgs);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        uri.getClass();
        return 0;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/gncs/persistence/contentprovider/ApplicationsContentProvider$Companion;", "", "()V", "getContentProviderUri", "Landroid/net/Uri;", "appContext", "Landroid/content/Context;", "isPackageInstalled", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private final boolean isPackageInstalled(Context context, String str) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                return packageManager.getPackageInfo(str, 0) != null;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final Uri getContentProviderUri(Context appContext) {
            Object next;
            appContext.getClass();
            Iterator it = x.k("com.garmin.coresample", "com.garmin.android.apps.connectmobile", "com.garmin.android.apps.golf", "com.garmin.android.apps.dive", "com.garmin.android.apps.explore", "com.garmin.android.apps.explore.develop", "com.garmin.android.marine").iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!ApplicationsContentProvider.INSTANCE.isPackageInstalled(appContext, (String) next));
            String packageName = (String) next;
            if (packageName == null) {
                packageName = appContext.getPackageName();
            }
            Uri uri = Uri.parse("content://" + packageName + ".gncs.ApplicationsContentProvider");
            uri.getClass();
            return uri;
        }

        private Companion() {
        }
    }
}
