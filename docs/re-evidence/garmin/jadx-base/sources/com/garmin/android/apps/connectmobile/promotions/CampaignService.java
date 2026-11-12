package com.garmin.android.apps.connectmobile.promotions;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import cf2.f;
import cf2.n;
import cf2.o;
import ch.qos.logback.core.CoreConstants;
import ff2.i;
import gt2.b;
import gt2.c;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import ue.i0;
import ue.l;
import ue.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/promotions/CampaignService;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"Instantiatable"})
public final class CampaignService extends Worker {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f41048f = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Logger f41049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CampaignService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        int i14 = c.f79010a;
        this.f41049e = b.f79005a.h("CAMPAIGN_SERVICE");
    }

    @Override // androidx.work.Worker
    public final d.a c() {
        this.f41049e.debug("onHandleWork: Clearing cache and fetching campaigns");
        ff2.c.a aVar = ff2.c.f71140c;
        Context context = this.f11469a;
        context.getClass();
        i iVar = aVar.a(context).f71143b;
        iVar.getClass();
        f fVar = f.f27037a;
        Context context2 = iVar.f71157a;
        i.c cVar = iVar.f71160d;
        fVar.getClass();
        o oVar = new o(context2, cVar);
        oVar.m().debug("fetchCampaigns: ");
        oVar.b(new n(oVar));
        com.garmin.android.library.backgroundtaskmanagement.c.d(oVar, null);
        return new d.a.c();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/promotions/CampaignService$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(Context context) {
            context.getClass();
            com.airbnb.lottie.animation.keyframe.a.o(i0.f170088a, context).a("CAMPAIGN_SERVICE", l.REPLACE, new x.a((Class<? extends d>) CampaignService.class).a()).a();
        }

        private a() {
        }
    }
}
