package org.acra.data;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.acra.ACRA;
import org.acra.builder.ReportBuilder;
import org.acra.collector.ApplicationStartupCollector;
import org.acra.collector.Collector;
import org.acra.collector.CollectorException;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportDataFactory;

/* JADX INFO: loaded from: classes23.dex */
public final class CrashReportDataFactory {
    private final Context a;
    private final CoreConfiguration b;
    private final List<Collector> c;

    public CrashReportDataFactory(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration) {
        this.a = context;
        this.b = coreConfiguration;
        List<Collector> listLoadEnabled = coreConfiguration.pluginLoader().loadEnabled(coreConfiguration, Collector.class);
        this.c = listLoadEnabled;
        Collections.sort(listLoadEnabled, new Comparator() { // from class: k11
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CrashReportDataFactory.d((Collector) obj, (Collector) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Collector collector, ReportBuilder reportBuilder, CrashReportData crashReportData) {
        try {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "Calling collector " + collector.getClass().getName());
            }
            collector.collect(this.a, this.b, reportBuilder, crashReportData);
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "Collector " + collector.getClass().getName() + " completed");
            }
        } catch (CollectorException e) {
            ACRA.log.w(ACRA.LOG_TAG, e);
        } catch (Exception e2) {
            ACRA.log.e(ACRA.LOG_TAG, "Error in collector " + collector.getClass().getSimpleName(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int d(Collector collector, Collector collector2) {
        Collector.Order order;
        Collector.Order order2;
        try {
            order = collector.getOrder();
        } catch (Exception unused) {
            order = Collector.Order.NORMAL;
        }
        try {
            order2 = collector2.getOrder();
        } catch (Exception unused2) {
            order2 = Collector.Order.NORMAL;
        }
        return order.ordinal() - order2.ordinal();
    }

    public void collectStartUp() {
        for (Collector collector : this.c) {
            if (collector instanceof ApplicationStartupCollector) {
                try {
                    ((ApplicationStartupCollector) collector).collectApplicationStartUp(this.a, this.b);
                } catch (Exception e) {
                    ACRA.log.w(ACRA.LOG_TAG, collector.getClass().getSimpleName() + " failed to collect its startup data", e);
                }
            }
        }
    }

    @NonNull
    public CrashReportData createCrashData(@NonNull final ReportBuilder reportBuilder) {
        ExecutorService executorServiceNewCachedThreadPool = this.b.parallel() ? Executors.newCachedThreadPool() : Executors.newSingleThreadExecutor();
        final CrashReportData crashReportData = new CrashReportData();
        ArrayList<Future> arrayList = new ArrayList();
        for (final Collector collector : this.c) {
            arrayList.add(executorServiceNewCachedThreadPool.submit(new Runnable() { // from class: j11
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c(collector, reportBuilder, crashReportData);
                }
            }));
        }
        for (Future future : arrayList) {
            while (!future.isDone()) {
                try {
                    future.get();
                } catch (InterruptedException unused) {
                } catch (ExecutionException unused2) {
                }
            }
        }
        return crashReportData;
    }
}
