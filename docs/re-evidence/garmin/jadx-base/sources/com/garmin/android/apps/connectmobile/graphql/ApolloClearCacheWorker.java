package com.garmin.android.apps.connectmobile.graphql;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import t13.d;
import ue.c0;
import ue.i0;
import ue.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/graphql/ApolloClearCacheWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "gcm-graphql_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ApolloClearCacheWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f36130g = new a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloClearCacheWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(d<? super androidx.work.d.a> dVar) {
        fm0.a.f72093a.getClass();
        fm0.a.a();
        a2 a2Var = a2.GRAPH_QL;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ApolloClearCacheWorker", "Apollo clear cache was successful.");
        return new androidx.work.d.a.c();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/graphql/ApolloClearCacheWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-graphql_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(Context context) {
            com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context).f("ApolloClearCacheWorker", k.REPLACE, new c0.a((Class<? extends androidx.work.d>) ApolloClearCacheWorker.class, 24L, TimeUnit.HOURS).e(new Duration(DateTime.now(), DateTime.now().withTimeAtStartOfDay().plusDays(1)).getStandardMinutes(), TimeUnit.MINUTES).a());
        }

        private a() {
        }
    }
}
