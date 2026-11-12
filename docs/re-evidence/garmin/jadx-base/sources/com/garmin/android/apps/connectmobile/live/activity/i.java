package com.garmin.android.apps.connectmobile.live.activity;

import am.x0;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.Days;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/live/activity/i;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f38426b;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.garmin.android.apps.connectmobile.live.activity.i$a[], still in use, count: 1, list:
      (r0v1 com.garmin.android.apps.connectmobile.live.activity.i$a[]) from 0x0026: CONSTRUCTOR (r0v1 com.garmin.android.apps.connectmobile.live.activity.i$a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/live/activity/i$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        CACHE_PILATES_KEY,
        CACHE_YOGA_KEY,
        CACHE_OTHER_KEY;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ w13.c f38431e;

        static {
            f38431e = new w13.c(aVarArr);
        }

        private a() {
            super(str, i);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f38430d.clone();
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38432a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.f4326r2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.f4322q2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38432a = iArr;
        }
    }

    static {
        new b(null);
    }

    public i(Context context) {
        context.getClass();
        this.f38425a = context;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "LiveActivityExerciseCacheManager", "purgeCacheIfTooOld");
        File file = new File(context.getFilesDir(), "live_activity_exercise_cache");
        if (file.exists() && Days.daysBetween(new DateTime(file.lastModified()), DateTime.now()).getDays() >= 7) {
            if (file.delete()) {
                i2.a.b(a2Var, "LiveActivityExerciseCacheManager", "Purged cache.");
            } else {
                i2.a.b(a2Var, "LiveActivityExerciseCacheManager", "Failed to purge cache.");
            }
        }
        i2.a.b(a2Var, "LiveActivityExerciseCacheManager", "loadCache");
        File file2 = new File(context.getFilesDir(), "live_activity_exercise_cache");
        LinkedHashMap linkedHashMap = null;
        if (file2.exists()) {
            try {
                Map map = (Map) new Gson().fromJson(a23.e.a(file2, d53.c.f57666b), new j().getType());
                if (map != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(t0.a(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        Iterable<e> iterable = (Iterable) entry.getValue();
                        ArrayList arrayList = new ArrayList(y.r(iterable, 10));
                        for (e eVar : iterable) {
                            com.garmin.android.apps.connectmobile.repcounting.model.d dVar = new com.garmin.android.apps.connectmobile.repcounting.model.d();
                            dVar.f41102a = eVar.f38400a;
                            dVar.f41103b = eVar.f38401b;
                            dVar.f41104c = eVar.f38402c;
                            dVar.f41105d = eVar.f38403d;
                            dVar.f41106e = eVar.f38404e;
                            dVar.f41107f = eVar.f38405f;
                            dVar.f41108g = eVar.f38406g;
                            dVar.f41109h = eVar.f38407h;
                            dVar.f41110i = eVar.f38408i;
                            arrayList.add(dVar);
                        }
                        linkedHashMap2.put(key, arrayList);
                    }
                    linkedHashMap = new LinkedHashMap(t0.a(linkedHashMap2.size()));
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        Object key2 = entry2.getKey();
                        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = new com.garmin.android.apps.connectmobile.repcounting.model.c();
                        cVar.I((com.garmin.android.apps.connectmobile.repcounting.model.d[]) ((Collection) entry2.getValue()).toArray(new com.garmin.android.apps.connectmobile.repcounting.model.d[0]));
                        linkedHashMap.put(key2, cVar);
                    }
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.b(a2Var2, "LiveActivityExerciseCacheManager", "Loaded live_activity_exercise_cache. Returning " + linkedHashMap);
                }
            } catch (JsonParseException e4) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar3.getClass();
                i2.a.p(a2Var3, "LiveActivityExerciseCacheManager", "Discarding malformed live_activity_exercise_cache cache: " + e4);
                if (!file2.delete()) {
                    i2.a.p(a2Var3, "LiveActivityExerciseCacheManager", "Unable to delete malformed live_activity_exercise_cache cache");
                }
            }
        } else {
            i2.a.b(a2Var, "LiveActivityExerciseCacheManager", "Cache file live_activity_exercise_cache not found.");
        }
        this.f38426b = linkedHashMap != null ? new LinkedHashMap(linkedHashMap) : new LinkedHashMap();
    }

    public static a b(x0 x0Var) {
        int i14 = c.f38432a[x0Var.ordinal()];
        if (i14 != 1) {
            return i14 != 2 ? a.CACHE_OTHER_KEY : a.CACHE_YOGA_KEY;
        }
        return a.CACHE_PILATES_KEY;
    }

    public final void a(x0 x0Var, com.garmin.android.apps.connectmobile.repcounting.model.c cVar) throws IOException {
        x0Var.getClass();
        a aVarB = b(x0Var);
        LinkedHashMap linkedHashMap = this.f38426b;
        linkedHashMap.put(aVarB, cVar);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(t0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((com.garmin.android.apps.connectmobile.repcounting.model.c) entry.getValue()).F());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(t0.a(linkedHashMap2.size()));
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            Object[] objArr = (Object[]) entry2.getValue();
            ArrayList arrayList = new ArrayList(objArr.length);
            int length = objArr.length;
            int i14 = 0;
            while (i14 < length) {
                com.garmin.android.apps.connectmobile.repcounting.model.d dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) objArr[i14];
                arrayList.add(new e(dVar.f41102a, dVar.f41103b, dVar.f41104c, dVar.f41105d, dVar.f41106e, dVar.f41107f, dVar.f41108g, dVar.f41109h, dVar.f41110i));
                i14++;
                it = it;
            }
            linkedHashMap3.put(key, arrayList);
        }
        String json = new Gson().toJson(linkedHashMap3);
        Context context = this.f38425a;
        File file = new File(context.getFilesDir(), "live_activity_exercise_cache");
        File fileCreateTempFile = File.createTempFile("live_activity_exercise_cache", ".tmp", context.getFilesDir());
        try {
            fileCreateTempFile.getClass();
            json.getClass();
            Charset charset = d53.c.f57666b;
            charset.getClass();
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            try {
                a23.e.b(fileOutputStream, json, charset);
                Unit unit = Unit.INSTANCE;
                fileOutputStream.close();
                if (!fileCreateTempFile.renameTo(file)) {
                    throw new IllegalStateException("Unable to replace live_activity_exercise_cache");
                }
                fileCreateTempFile.delete();
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "LiveActivityExerciseCacheManager", "Saved exercises to disk.");
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(fileOutputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            fileCreateTempFile.delete();
            throw th5;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/live/activity/i$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "CACHE_FILE_NAME", "", "CACHE_EXPIRATION_IN_DAYS", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
