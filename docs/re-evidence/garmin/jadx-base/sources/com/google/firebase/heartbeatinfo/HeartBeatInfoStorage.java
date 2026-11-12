package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.firebase.datastorage.JavaDataStorageKt;
import e23.l;
import i3.e5;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p005kotlin.Unit;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
class HeartBeatInfoStorage {
    private static final String HEARTBEAT_PREFERENCES_NAME = "FirebaseHeartBeat";
    private static final int HEART_BEAT_COUNT_LIMIT = 30;
    private static final String PREFERENCES_NAME = "FirebaseAppHeartBeat";
    private static HeartBeatInfoStorage instance;
    private final JavaDataStorage firebaseDataStore;
    private static final y7.g.a<Long> GLOBAL = new y7.g.a<>("fire-global");
    private static final y7.g.a<Long> HEART_BEAT_COUNT_TAG = new y7.g.a<>("fire-count");
    private static final y7.g.a<String> LAST_STORED_DATE = new y7.g.a<>("last-used-date");

    public HeartBeatInfoStorage(Context context, String str) {
        this.firebaseDataStore = new JavaDataStorage(context, fb1.c.n(HEARTBEAT_PREFERENCES_NAME, str));
    }

    private synchronized long cleanUpStoredHeartBeats(y7.b bVar) {
        long j8;
        try {
            long jLongValue = ((Long) JavaDataStorageKt.getOrDefault(bVar, HEART_BEAT_COUNT_TAG, 0L)).longValue();
            String str = "";
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry<y7.g.a<?>, Object> entry : bVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 == null || str2.compareTo(str3) > 0) {
                            str = entry.getKey().f194635a;
                            hashSet = set;
                            str2 = str3;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            str.getClass();
            bVar.f(new y7.g.a<>(str), hashSet2);
            j8 = jLongValue - 1;
            bVar.e(HEART_BEAT_COUNT_TAG, Long.valueOf(j8));
        } catch (Throwable th3) {
            throw th3;
        }
        return j8;
    }

    private synchronized String getFormattedDate(long j8) {
        return new Date(j8).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private synchronized y7.g.a<Set<String>> getStoredUserAgentString(y7.b bVar, String str) {
        for (Map.Entry<y7.g.a<?>, Object> entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return new y7.g.a<>(entry.getKey().f194635a);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit lambda$deleteAllHeartBeats$0(y7.b bVar) {
        Map<y7.g.a<?>, Object> mapA = bVar.a();
        Map<y7.g.a<?>, Object> map = bVar.f194626a;
        long j8 = 0;
        for (Map.Entry<y7.g.a<?>, Object> entry : mapA.entrySet()) {
            if (entry.getValue() instanceof Set) {
                y7.g.a<?> key = entry.getKey();
                Set set = (Set) entry.getValue();
                String formattedDate = getFormattedDate(System.currentTimeMillis());
                if (set.contains(formattedDate)) {
                    Object[] objArr = {formattedDate};
                    HashSet hashSet = new HashSet(1);
                    Object obj = objArr[0];
                    Objects.requireNonNull(obj);
                    if (!hashSet.add(obj)) {
                        h.s(e5.f(obj, "duplicate element: "));
                        return null;
                    }
                    bVar.e(key, Collections.unmodifiableSet(hashSet));
                    j8++;
                } else {
                    key.getClass();
                    bVar.d();
                    map.remove(key);
                }
            }
        }
        if (j8 != 0) {
            bVar.e(HEART_BEAT_COUNT_TAG, Long.valueOf(j8));
            return null;
        }
        y7.g.a<Long> aVar = HEART_BEAT_COUNT_TAG;
        aVar.getClass();
        bVar.d();
        map.remove(aVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$postHeartBeatCleanUp$1(String str, y7.b bVar) {
        bVar.e(LAST_STORED_DATE, str);
        removeStoredDate(bVar, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit lambda$storeHeartBeat$2(String str, String str2, y7.g.a aVar, y7.b bVar) {
        y7.g.a<String> aVar2 = LAST_STORED_DATE;
        if (((String) JavaDataStorageKt.getOrDefault(bVar, aVar2, "")).equals(str)) {
            y7.g.a<Set<String>> storedUserAgentString = getStoredUserAgentString(bVar, str);
            if (storedUserAgentString == null || storedUserAgentString.f194635a.equals(str2)) {
                return null;
            }
            updateStoredUserAgent(bVar, aVar, str);
            return null;
        }
        y7.g.a<Long> aVar3 = HEART_BEAT_COUNT_TAG;
        long jLongValue = ((Long) JavaDataStorageKt.getOrDefault(bVar, aVar3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = cleanUpStoredHeartBeats(bVar);
        }
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(bVar, aVar, new HashSet()));
        hashSet.add(str);
        bVar.e(aVar, hashSet);
        bVar.e(aVar3, Long.valueOf(jLongValue + 1));
        bVar.e(aVar2, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit lambda$updateGlobalHeartBeat$3(long j8, y7.b bVar) {
        bVar.e(GLOBAL, Long.valueOf(j8));
        return null;
    }

    private synchronized void removeStoredDate(y7.b bVar, String str) {
        y7.g.a<?> storedUserAgentString = getStoredUserAgentString(bVar, str);
        if (storedUserAgentString == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(bVar, storedUserAgentString, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            bVar.getClass();
            bVar.d();
            bVar.f194626a.remove(storedUserAgentString);
        } else {
            bVar.getClass();
            bVar.f(storedUserAgentString, hashSet);
        }
    }

    private synchronized void updateStoredUserAgent(y7.b bVar, y7.g.a<Set<String>> aVar, String str) {
        removeStoredDate(bVar, str);
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(bVar, aVar, new HashSet()));
        hashSet.add(str);
        bVar.e(aVar, hashSet);
    }

    public synchronized void deleteAllHeartBeats() {
        this.firebaseDataStore.editSync(new l() { // from class: com.google.firebase.heartbeatinfo.e
            @Override // e23.l
            public final Object invoke(Object obj) {
                return this.f53743a.lambda$deleteAllHeartBeats$0((y7.b) obj);
            }
        });
    }

    public synchronized List<HeartBeatResult> getAllHeartBeats() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String formattedDate = getFormattedDate(System.currentTimeMillis());
            for (Map.Entry<y7.g.a<?>, Object> entry : this.firebaseDataStore.getAllSync().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(formattedDate);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.create(entry.getKey().f194635a, new ArrayList(hashSet)));
                    }
                }
            }
            updateGlobalHeartBeat(System.currentTimeMillis());
        } catch (Throwable th3) {
            throw th3;
        }
        return arrayList;
    }

    public int getHeartBeatCount() {
        return ((Long) this.firebaseDataStore.getSync(HEART_BEAT_COUNT_TAG, 0L)).intValue();
    }

    public synchronized long getLastGlobalHeartBeat() {
        return ((Long) this.firebaseDataStore.getSync(GLOBAL, -1L)).longValue();
    }

    public synchronized boolean isSameDateUtc(long j8, long j14) {
        return getFormattedDate(j8).equals(getFormattedDate(j14));
    }

    public synchronized void postHeartBeatCleanUp() {
        final String formattedDate = getFormattedDate(System.currentTimeMillis());
        this.firebaseDataStore.editSync(new l() { // from class: com.google.firebase.heartbeatinfo.f
            @Override // e23.l
            public final Object invoke(Object obj) {
                return this.f53744a.lambda$postHeartBeatCleanUp$1(formattedDate, (y7.b) obj);
            }
        });
    }

    public synchronized boolean shouldSendGlobalHeartBeat(long j8) {
        return shouldSendSdkHeartBeat(GLOBAL, j8);
    }

    public synchronized boolean shouldSendSdkHeartBeat(y7.g.a<Long> aVar, long j8) {
        if (isSameDateUtc(((Long) this.firebaseDataStore.getSync(aVar, -1L)).longValue(), j8)) {
            return false;
        }
        this.firebaseDataStore.putSync(aVar, Long.valueOf(j8));
        return true;
    }

    public synchronized void storeHeartBeat(long j8, final String str) {
        final String formattedDate = getFormattedDate(j8);
        str.getClass();
        final y7.g.a aVar = new y7.g.a(str);
        this.firebaseDataStore.editSync(new l() { // from class: com.google.firebase.heartbeatinfo.d
            @Override // e23.l
            public final Object invoke(Object obj) {
                return this.f53739a.lambda$storeHeartBeat$2(formattedDate, str, aVar, (y7.b) obj);
            }
        });
    }

    public synchronized void updateGlobalHeartBeat(final long j8) {
        this.firebaseDataStore.editSync(new l() { // from class: com.google.firebase.heartbeatinfo.g
            @Override // e23.l
            public final Object invoke(Object obj) {
                return HeartBeatInfoStorage.lambda$updateGlobalHeartBeat$3(j8, (y7.b) obj);
            }
        });
    }

    public HeartBeatInfoStorage(JavaDataStorage javaDataStorage) {
        this.firebaseDataStore = javaDataStorage;
    }
}
