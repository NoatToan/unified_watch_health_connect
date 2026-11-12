package com.google.firebase.abt;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseABTesting {

    @VisibleForTesting
    public static final String d = "com.google.firebase.abt";

    @VisibleForTesting
    public static final String e = "%s_lastKnownExperimentStartTime";
    private final Provider<AnalyticsConnector> a;
    private final String b;

    @Nullable
    private Integer c = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface OriginService {
        public static final String INAPP_MESSAGING = "fiam";
        public static final String REMOTE_CONFIG = "frc";
    }

    public FirebaseABTesting(Context context, Provider<AnalyticsConnector> provider, String str) {
        this.a = provider;
        this.b = str;
    }

    private void a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        this.a.get().setConditionalUserProperty(conditionalUserProperty);
    }

    private void b(List<AbtExperimentInfo> list) {
        ArrayDeque arrayDeque = new ArrayDeque(d());
        int iG = g();
        for (AbtExperimentInfo abtExperimentInfo : list) {
            while (arrayDeque.size() >= iG) {
                h(((AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).name);
            }
            AnalyticsConnector.ConditionalUserProperty conditionalUserPropertyI = abtExperimentInfo.i(this.b);
            a(conditionalUserPropertyI);
            arrayDeque.offer(conditionalUserPropertyI);
        }
    }

    private static List<AbtExperimentInfo> c(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(AbtExperimentInfo.b(it2.next()));
        }
        return arrayList;
    }

    @WorkerThread
    private List<AnalyticsConnector.ConditionalUserProperty> d() {
        return this.a.get().getConditionalUserProperties(this.b, "");
    }

    private ArrayList<AbtExperimentInfo> e(List<AbtExperimentInfo> list, Set<String> set) {
        ArrayList<AbtExperimentInfo> arrayList = new ArrayList<>();
        for (AbtExperimentInfo abtExperimentInfo : list) {
            if (!set.contains(abtExperimentInfo.c())) {
                arrayList.add(abtExperimentInfo);
            }
        }
        return arrayList;
    }

    private ArrayList<AnalyticsConnector.ConditionalUserProperty> f(List<AnalyticsConnector.ConditionalUserProperty> list, Set<String> set) {
        ArrayList<AnalyticsConnector.ConditionalUserProperty> arrayList = new ArrayList<>();
        for (AnalyticsConnector.ConditionalUserProperty conditionalUserProperty : list) {
            if (!set.contains(conditionalUserProperty.name)) {
                arrayList.add(conditionalUserProperty);
            }
        }
        return arrayList;
    }

    @WorkerThread
    private int g() {
        if (this.c == null) {
            this.c = Integer.valueOf(this.a.get().getMaxUserProperties(this.b));
        }
        return this.c.intValue();
    }

    private void h(String str) {
        this.a.get().clearConditionalUserProperty(str, null, null);
    }

    private void i(Collection<AnalyticsConnector.ConditionalUserProperty> collection) {
        Iterator<AnalyticsConnector.ConditionalUserProperty> it2 = collection.iterator();
        while (it2.hasNext()) {
            h(it2.next().name);
        }
    }

    private void j(List<AbtExperimentInfo> list) throws AbtException {
        if (list.isEmpty()) {
            removeAllExperiments();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<AbtExperimentInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().c());
        }
        List<AnalyticsConnector.ConditionalUserProperty> listD = d();
        HashSet hashSet2 = new HashSet();
        Iterator<AnalyticsConnector.ConditionalUserProperty> it3 = listD.iterator();
        while (it3.hasNext()) {
            hashSet2.add(it3.next().name);
        }
        i(f(listD, hashSet));
        b(e(list, hashSet2));
    }

    private void k() throws AbtException {
        if (this.a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    @WorkerThread
    public List<AbtExperimentInfo> getAllExperiments() throws AbtException {
        k();
        List<AnalyticsConnector.ConditionalUserProperty> listD = d();
        ArrayList arrayList = new ArrayList();
        Iterator<AnalyticsConnector.ConditionalUserProperty> it2 = listD.iterator();
        while (it2.hasNext()) {
            arrayList.add(AbtExperimentInfo.a(it2.next()));
        }
        return arrayList;
    }

    @WorkerThread
    public void removeAllExperiments() throws AbtException {
        k();
        i(d());
    }

    @WorkerThread
    public void replaceAllExperiments(List<Map<String, String>> list) throws AbtException {
        k();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        j(c(list));
    }

    @WorkerThread
    public void reportActiveExperiment(AbtExperimentInfo abtExperimentInfo) throws AbtException {
        k();
        AbtExperimentInfo.k(abtExperimentInfo);
        ArrayList arrayList = new ArrayList();
        Map<String, String> mapJ = abtExperimentInfo.j();
        mapJ.remove(AbtExperimentInfo.i);
        arrayList.add(AbtExperimentInfo.b(mapJ));
        b(arrayList);
    }

    @WorkerThread
    public void validateRunningExperiments(List<AbtExperimentInfo> list) throws AbtException {
        k();
        HashSet hashSet = new HashSet();
        Iterator<AbtExperimentInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().c());
        }
        i(f(d(), hashSet));
    }
}
