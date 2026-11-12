package com.google.firebase.perf;

import com.google.firebase.Firebase;
import com.google.firebase.perf.metrics.HttpMetric;
import com.google.firebase.perf.metrics.Trace;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\b\u001a5\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\r*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"Lcom/google/firebase/perf/metrics/HttpMetric;", "Lkotlin/Function1;", "", "block", "trace", "(Lcom/google/firebase/perf/metrics/HttpMetric;Le23/l;)V", "T", "Lcom/google/firebase/perf/metrics/Trace;", "(Lcom/google/firebase/perf/metrics/Trace;Le23/l;)Ljava/lang/Object;", "", "name", "(Ljava/lang/String;Le23/l;)Ljava/lang/Object;", "Lcom/google/firebase/Firebase;", "Lcom/google/firebase/perf/FirebasePerformance;", "getPerformance", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/perf/FirebasePerformance;", "performance", "com.google.firebase-firebase-perf"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PerformanceKt {
    public static final FirebasePerformance getPerformance(Firebase firebase) {
        firebase.getClass();
        FirebasePerformance firebasePerformance = FirebasePerformance.getInstance();
        firebasePerformance.getClass();
        return firebasePerformance;
    }

    public static final <T> T trace(String str, l<? super Trace, ? extends T> lVar) {
        str.getClass();
        lVar.getClass();
        Trace traceCreate = Trace.create(str);
        traceCreate.getClass();
        traceCreate.start();
        try {
            return lVar.invoke(traceCreate);
        } finally {
            traceCreate.stop();
        }
    }

    public static final <T> T trace(Trace trace, l<? super Trace, ? extends T> lVar) {
        trace.getClass();
        lVar.getClass();
        trace.start();
        try {
            return lVar.invoke(trace);
        } finally {
            trace.stop();
        }
    }

    public static final void trace(HttpMetric httpMetric, l<? super HttpMetric, Unit> lVar) {
        httpMetric.getClass();
        lVar.getClass();
        httpMetric.start();
        try {
            lVar.invoke(httpMetric);
        } finally {
            httpMetric.stop();
        }
    }
}
