package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001b2\u00020\u0001:\u0003\u001b\u001c\u0003B\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR(\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\rR(\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\rR$\u0010\u0015\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers;", "", "", "a", "Ljava/lang/String;", "androidAdvertiserIdValue", "", "b", "J", "fetchTime", "<set-?>", "c", "getAttributionId", "()Ljava/lang/String;", "attributionId", GoogleApiAvailabilityLight.a, "getAndroidInstallerPackage", "androidInstallerPackage", "", "e", "Z", "isTrackingLimited", "()Z", "getAndroidAdvertiserId", "androidAdvertiserId", "<init>", "()V", "Companion", "GoogleAdInfo", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AttributionIdentifiers {

    @JvmField
    @Nullable
    public static AttributionIdentifiers cachedIdentifiers = null;
    private static final String g = "com.facebook.katana.provider.AttributionIdProvider";
    private static final String h = "com.facebook.wakizashi.provider.AttributionIdProvider";
    private static final String i = "aid";
    private static final String j = "androidid";
    private static final String k = "limit_tracking";
    private static final int l = 0;
    private static final long m = 3600000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String androidAdvertiserIdValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long fetchTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String attributionId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String androidInstallerPackage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isTrackingLimited;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String f = AttributionIdentifiers.class.getCanonicalName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/facebook/internal/AttributionIdentifiers;", "b", "c", "", "f", GoogleApiAvailabilityLight.a, "identifiers", "a", "", "e", "isTrackingLimited", "getAttributionIdentifiers", "ANDROID_ID_COLUMN_NAME", "Ljava/lang/String;", "ATTRIBUTION_ID_COLUMN_NAME", "ATTRIBUTION_ID_CONTENT_PROVIDER", "ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI", "", "CONNECTION_RESULT_SUCCESS", LogUtil.I, "", "IDENTIFIER_REFRESH_INTERVAL_MILLIS", "J", "LIMIT_TRACKING_COLUMN_NAME", "TAG", "cachedIdentifiers", "Lcom/facebook/internal/AttributionIdentifiers;", "getCachedIdentifiers$facebook_core_release$annotations", "()V", "<init>", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        private final AttributionIdentifiers a(AttributionIdentifiers identifiers) {
            identifiers.fetchTime = System.currentTimeMillis();
            AttributionIdentifiers.cachedIdentifiers = identifiers;
            return identifiers;
        }

        private final AttributionIdentifiers b(Context context) {
            AttributionIdentifiers attributionIdentifiersC = c(context);
            if (attributionIdentifiersC != null) {
                return attributionIdentifiersC;
            }
            AttributionIdentifiers attributionIdentifiersD = d(context);
            return attributionIdentifiersD == null ? new AttributionIdentifiers() : attributionIdentifiersD;
        }

        private final AttributionIdentifiers c(Context context) {
            Object objInvokeMethodQuietly;
            try {
                if (!f(context)) {
                    return null;
                }
                Method methodQuietly = Utility.getMethodQuietly("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class});
                if (methodQuietly != null && (objInvokeMethodQuietly = Utility.invokeMethodQuietly(null, methodQuietly, context)) != null) {
                    Method methodQuietly2 = Utility.getMethodQuietly(objInvokeMethodQuietly.getClass(), "getId", (Class<?>[]) new Class[0]);
                    Method methodQuietly3 = Utility.getMethodQuietly(objInvokeMethodQuietly.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
                    if (methodQuietly2 != null && methodQuietly3 != null) {
                        AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                        attributionIdentifiers.androidAdvertiserIdValue = (String) Utility.invokeMethodQuietly(objInvokeMethodQuietly, methodQuietly2, new Object[0]);
                        Boolean bool = (Boolean) Utility.invokeMethodQuietly(objInvokeMethodQuietly, methodQuietly3, new Object[0]);
                        attributionIdentifiers.isTrackingLimited = bool != null ? bool.booleanValue() : false;
                        return attributionIdentifiers;
                    }
                }
                return null;
            } catch (Exception e) {
                Utility.logd("android_id", e);
                return null;
            }
        }

        private final AttributionIdentifiers d(Context context) {
            a aVar = new a();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, aVar, 1)) {
                    try {
                        GoogleAdInfo googleAdInfo = new GoogleAdInfo(aVar.a());
                        AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                        attributionIdentifiers.androidAdvertiserIdValue = googleAdInfo.d();
                        attributionIdentifiers.isTrackingLimited = googleAdInfo.e();
                        return attributionIdentifiers;
                    } catch (Exception e) {
                        Utility.logd("android_id", e);
                        return null;
                    } finally {
                        context.unbindService(aVar);
                    }
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        private final String e(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(context.getPackageName());
            }
            return null;
        }

        private final boolean f(Context context) {
            Method methodQuietly = Utility.getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
            if (methodQuietly == null) {
                return false;
            }
            Object objInvokeMethodQuietly = Utility.invokeMethodQuietly(null, methodQuietly, context);
            return (objInvokeMethodQuietly instanceof Integer) && !(Intrinsics.areEqual(objInvokeMethodQuietly, (Object) 0) ^ true);
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getCachedIdentifiers$facebook_core_release$annotations() {
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0071 A[Catch: all -> 0x00e1, Exception -> 0x00e3, TryCatch #5 {Exception -> 0x00e3, all -> 0x00e1, blocks: (B:3:0x000b, B:5:0x0019, B:7:0x001d, B:10:0x002e, B:12:0x0049, B:14:0x0051, B:21:0x006b, B:23:0x0071, B:25:0x0076, B:27:0x007b, B:17:0x005b, B:19:0x0063, B:48:0x00d9, B:49:0x00e0), top: B:65:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:25:0x0076 A[Catch: all -> 0x00e1, Exception -> 0x00e3, TryCatch #5 {Exception -> 0x00e3, all -> 0x00e1, blocks: (B:3:0x000b, B:5:0x0019, B:7:0x001d, B:10:0x002e, B:12:0x0049, B:14:0x0051, B:21:0x006b, B:23:0x0071, B:25:0x0076, B:27:0x007b, B:17:0x005b, B:19:0x0063, B:48:0x00d9, B:49:0x00e0), top: B:65:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:27:0x007b A[Catch: all -> 0x00e1, Exception -> 0x00e3, TRY_LEAVE, TryCatch #5 {Exception -> 0x00e3, all -> 0x00e1, blocks: (B:3:0x000b, B:5:0x0019, B:7:0x001d, B:10:0x002e, B:12:0x0049, B:14:0x0051, B:21:0x006b, B:23:0x0071, B:25:0x0076, B:27:0x007b, B:17:0x005b, B:19:0x0063, B:48:0x00d9, B:49:0x00e0), top: B:65:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:31:0x008e  */
        /* JADX WARN: Code duplicated, block: B:32:0x008f A[Catch: all -> 0x00c6, Exception -> 0x00ca, TryCatch #4 {Exception -> 0x00ca, all -> 0x00c6, blocks: (B:29:0x0088, B:32:0x008f, B:35:0x00a6, B:37:0x00ac, B:44:0x00cf), top: B:66:0x0088 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:61:0x0107  */
        /* JADX WARN: Code duplicated, block: B:66:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @JvmStatic
        @Nullable
        public final AttributionIdentifiers getAttributionIdentifiers(@NotNull Context context) {
            Cursor cursor;
            Uri uri;
            Uri uri2;
            String strE;
            Cursor cursorQuery;
            int columnIndex;
            int columnIndex2;
            AttributionIdentifiers attributionIdentifiersB = b(context);
            Cursor cursor2 = null;
            try {
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                }
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.cachedIdentifiers;
                if (attributionIdentifiers != null && System.currentTimeMillis() - attributionIdentifiers.fetchTime < 3600000) {
                    return attributionIdentifiers;
                }
                String[] strArr = {"aid", AttributionIdentifiers.j, AttributionIdentifiers.k};
                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(AttributionIdentifiers.g, 0);
                ProviderInfo providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider(AttributionIdentifiers.h, 0);
                if (providerInfoResolveContentProvider == null || !FacebookSignatureValidator.validateSignature(context, providerInfoResolveContentProvider.packageName)) {
                    if (providerInfoResolveContentProvider2 == null || !FacebookSignatureValidator.validateSignature(context, providerInfoResolveContentProvider2.packageName)) {
                        uri = null;
                    } else {
                        uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                    }
                    strE = e(context);
                    if (strE != null) {
                        attributionIdentifiersB.androidInstallerPackage = strE;
                    }
                    if (uri == null) {
                        return a(attributionIdentifiersB);
                    }
                    cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                int columnIndex3 = cursorQuery.getColumnIndex("aid");
                                columnIndex = cursorQuery.getColumnIndex(AttributionIdentifiers.j);
                                columnIndex2 = cursorQuery.getColumnIndex(AttributionIdentifiers.k);
                                attributionIdentifiersB.attributionId = cursorQuery.getString(columnIndex3);
                                if (columnIndex > 0 && columnIndex2 > 0 && attributionIdentifiersB.getAndroidAdvertiserId() == null) {
                                    attributionIdentifiersB.androidAdvertiserIdValue = cursorQuery.getString(columnIndex);
                                    attributionIdentifiersB.isTrackingLimited = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                                }
                                cursorQuery.close();
                                return a(attributionIdentifiersB);
                            }
                        } catch (Exception e) {
                            cursor = cursorQuery;
                            e = e;
                            try {
                                Utility.logd(AttributionIdentifiers.f, "Caught unexpected exception in getAttributionId(): " + e);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            cursor2 = cursorQuery;
                            th = th2;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    }
                    AttributionIdentifiers attributionIdentifiersA = a(attributionIdentifiersB);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return attributionIdentifiersA;
                }
                uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                uri = uri2;
                strE = e(context);
                if (strE != null) {
                    attributionIdentifiersB.androidInstallerPackage = strE;
                }
                if (uri == null) {
                    return a(attributionIdentifiersB);
                }
                cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                if (cursorQuery != null) {
                    if (!cursorQuery.moveToFirst()) {
                        int columnIndex4 = cursorQuery.getColumnIndex("aid");
                        columnIndex = cursorQuery.getColumnIndex(AttributionIdentifiers.j);
                        columnIndex2 = cursorQuery.getColumnIndex(AttributionIdentifiers.k);
                        attributionIdentifiersB.attributionId = cursorQuery.getString(columnIndex4);
                        if (columnIndex > 0) {
                            attributionIdentifiersB.androidAdvertiserIdValue = cursorQuery.getString(columnIndex);
                            attributionIdentifiersB.isTrackingLimited = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                        }
                        cursorQuery.close();
                        return a(attributionIdentifiersB);
                    }
                }
                AttributionIdentifiers attributionIdentifiersA2 = a(attributionIdentifiersB);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return attributionIdentifiersA2;
            } catch (Exception e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean isTrackingLimited(@NotNull Context context) {
            AttributionIdentifiers attributionIdentifiers = getAttributionIdentifiers(context);
            return attributionIdentifiers != null && attributionIdentifiers.getIsTrackingLimited();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0015\u0010\n\u001a\u0004\u0018\u00010\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0013\u0010\u000e\u001a\u00020\u000b8F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/AttributionIdentifiers$GoogleAdInfo;", "Landroid/os/IInterface;", "Landroid/os/IBinder;", "asBinder", "a", "Landroid/os/IBinder;", "binder", "", GoogleApiAvailabilityLight.a, "()Ljava/lang/String;", "advertiserId", "", "e", "()Z", "isTrackingLimited", "<init>", "(Landroid/os/IBinder;)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class GoogleAdInfo implements IInterface {
        private static final int b = 1;
        private static final int c = 2;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final IBinder binder;

        public GoogleAdInfo(@NotNull IBinder iBinder) {
            this.binder = iBinder;
        }

        @Override // android.os.IInterface
        @NotNull
        public IBinder asBinder() {
            return this.binder;
        }

        @Nullable
        public final String d() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.binder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean e() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.binder.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"com/facebook/internal/AttributionIdentifiers$a", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "", "onServiceConnected", "onServiceDisconnected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "consumed", "Ljava/util/concurrent/BlockingQueue;", "b", "Ljava/util/concurrent/BlockingQueue;", "queue", "()Landroid/os/IBinder;", "binder", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AtomicBoolean consumed = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final BlockingQueue<IBinder> queue = new LinkedBlockingDeque();

        @NotNull
        public final IBinder a() throws InterruptedException {
            if (!this.consumed.compareAndSet(true, true)) {
                return this.queue.take();
            }
            throw new IllegalStateException("Binder already consumed".toString());
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
            if (service != null) {
                try {
                    this.queue.put(service);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName name) {
        }
    }

    @JvmStatic
    @Nullable
    public static final AttributionIdentifiers getAttributionIdentifiers(@NotNull Context context) {
        return INSTANCE.getAttributionIdentifiers(context);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean isTrackingLimited(@NotNull Context context) {
        return INSTANCE.isTrackingLimited(context);
    }

    @Nullable
    public final String getAndroidAdvertiserId() {
        if (FacebookSdk.isInitialized() && FacebookSdk.getAdvertiserIDCollectionEnabled()) {
            return this.androidAdvertiserIdValue;
        }
        return null;
    }

    @Nullable
    public final String getAndroidInstallerPackage() {
        return this.androidInstallerPackage;
    }

    @Nullable
    public final String getAttributionId() {
        return this.attributionId;
    }

    /* JADX INFO: renamed from: isTrackingLimited, reason: from getter */
    public final boolean getIsTrackingLimited() {
        return this.isTrackingLimited;
    }
}
