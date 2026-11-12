package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/AppEventStore;", "", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppIdPair", "Lcom/facebook/appevents/SessionEventsState;", "appEvents", "", "persistEvents", "Lcom/facebook/appevents/AppEventCollection;", "eventsToPersist", "Lcom/facebook/appevents/PersistedEvents;", "readAndClearStore", "saveEventsToDisk$facebook_core_release", "(Lcom/facebook/appevents/PersistedEvents;)V", "saveEventsToDisk", "", "a", "Ljava/lang/String;", "TAG", "b", "PERSISTED_EVENTS_FILENAME", "<init>", "()V", "MovedClassObjectInputStream", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AppEventStore {

    @NotNull
    public static final AppEventStore INSTANCE = new AppEventStore();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = AppEventStore.class.getName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/facebook/appevents/AppEventStore$MovedClassObjectInputStream;", "Ljava/io/ObjectInputStream;", "Ljava/io/ObjectStreamClass;", "readClassDescriptor", "Ljava/io/InputStream;", "inputStream", "<init>", "(Ljava/io/InputStream;)V", "c", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class MovedClassObjectInputStream extends ObjectInputStream {
        private static final String a = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1";
        private static final String b = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2";

        public MovedClassObjectInputStream(@Nullable InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        @NotNull
        public ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass classDescriptor = super.readClassDescriptor();
            if (Intrinsics.areEqual(classDescriptor.getName(), a)) {
                return ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            }
            return Intrinsics.areEqual(classDescriptor.getName(), b) ? ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class) : classDescriptor;
        }
    }

    private AppEventStore() {
    }

    @JvmStatic
    public static final synchronized void persistEvents(@NotNull AccessTokenAppIdPair accessTokenAppIdPair, @NotNull SessionEventsState appEvents) {
        if (CrashShieldHandler.isObjectCrashing(AppEventStore.class)) {
            return;
        }
        try {
            AppEventUtility.assertIsNotMainThread();
            PersistedEvents andClearStore = readAndClearStore();
            andClearStore.addEvents(accessTokenAppIdPair, appEvents.getEventsToPersist());
            saveEventsToDisk$facebook_core_release(andClearStore);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventStore.class);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009b A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #1 {all -> 0x00a2, blocks: (B:9:0x000c, B:14:0x002b, B:15:0x002e, B:50:0x009b, B:18:0x0039, B:29:0x0057, B:30:0x005a, B:33:0x0065, B:34:0x0069, B:36:0x006e, B:37:0x0071, B:41:0x0083, B:40:0x007c, B:43:0x0085, B:44:0x0088, B:47:0x0093), top: B:61:0x000c, outer: #7, inners: #3, #6, #9, #11 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.content.Context] */
    @JvmStatic
    @NotNull
    public static final synchronized PersistedEvents readAndClearStore() {
        MovedClassObjectInputStream movedClassObjectInputStream;
        String str;
        String str2;
        PersistedEvents persistedEvents;
        ?? IsObjectCrashing = CrashShieldHandler.isObjectCrashing(AppEventStore.class);
        if (IsObjectCrashing != 0) {
            return null;
        }
        try {
            try {
                AppEventUtility.assertIsNotMainThread();
                IsObjectCrashing = FacebookSdk.getApplicationContext();
                try {
                    movedClassObjectInputStream = new MovedClassObjectInputStream(new BufferedInputStream(IsObjectCrashing.openFileInput(PERSISTED_EVENTS_FILENAME)));
                    try {
                        Object object = movedClassObjectInputStream.readObject();
                        if (object == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                        }
                        persistedEvents = (PersistedEvents) object;
                        Utility.closeQuietly(movedClassObjectInputStream);
                        try {
                            IsObjectCrashing.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception e) {
                            Log.w(TAG, "Got unexpected exception when removing events file: ", e);
                        }
                        if (persistedEvents == null) {
                            persistedEvents = new PersistedEvents();
                        }
                        return persistedEvents;
                    } catch (FileNotFoundException unused) {
                        Utility.closeQuietly(movedClassObjectInputStream);
                        try {
                            IsObjectCrashing.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception e2) {
                            e = e2;
                            str = TAG;
                            str2 = "Got unexpected exception when removing events file: ";
                            Log.w(str, str2, e);
                            persistedEvents = null;
                            if (persistedEvents == null) {
                                persistedEvents = new PersistedEvents();
                            }
                            return persistedEvents;
                        }
                        persistedEvents = null;
                        if (persistedEvents == null) {
                            persistedEvents = new PersistedEvents();
                        }
                        return persistedEvents;
                    } catch (Exception e3) {
                        e = e3;
                        Log.w(TAG, "Got unexpected exception while reading events: ", e);
                        Utility.closeQuietly(movedClassObjectInputStream);
                        try {
                            IsObjectCrashing.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception e4) {
                            e = e4;
                            str = TAG;
                            str2 = "Got unexpected exception when removing events file: ";
                            Log.w(str, str2, e);
                            persistedEvents = null;
                            if (persistedEvents == null) {
                                persistedEvents = new PersistedEvents();
                            }
                            return persistedEvents;
                        }
                        persistedEvents = null;
                        if (persistedEvents == null) {
                            persistedEvents = new PersistedEvents();
                        }
                        return persistedEvents;
                    }
                } catch (FileNotFoundException unused2) {
                    movedClassObjectInputStream = null;
                } catch (Exception e5) {
                    e = e5;
                    movedClassObjectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    Utility.closeQuietly(null);
                    try {
                        IsObjectCrashing.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                    } catch (Exception e6) {
                        Log.w(TAG, "Got unexpected exception when removing events file: ", e6);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, AppEventStore.class);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @JvmStatic
    public static final void saveEventsToDisk$facebook_core_release(@Nullable PersistedEvents eventsToPersist) {
        if (CrashShieldHandler.isObjectCrashing(AppEventStore.class)) {
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(applicationContext.openFileOutput(PERSISTED_EVENTS_FILENAME, 0)));
                try {
                    objectOutputStream2.writeObject(eventsToPersist);
                    Utility.closeQuietly(objectOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    try {
                        Log.w(TAG, "Got unexpected exception while persisting events: ", th);
                        try {
                            applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception unused) {
                        }
                    } finally {
                        Utility.closeQuietly(objectOutputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            CrashShieldHandler.handleThrowable(th3, AppEventStore.class);
        }
    }

    @JvmStatic
    public static final synchronized void persistEvents(@NotNull AppEventCollection eventsToPersist) {
        if (CrashShieldHandler.isObjectCrashing(AppEventStore.class)) {
            return;
        }
        try {
            AppEventUtility.assertIsNotMainThread();
            PersistedEvents andClearStore = readAndClearStore();
            for (AccessTokenAppIdPair accessTokenAppIdPair : eventsToPersist.keySet()) {
                SessionEventsState sessionEventsState = eventsToPersist.get(accessTokenAppIdPair);
                if (sessionEventsState != null) {
                    andClearStore.addEvents(accessTokenAppIdPair, sessionEventsState.getEventsToPersist());
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            saveEventsToDisk$facebook_core_release(andClearStore);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventStore.class);
        }
    }
}
