package io.sentry.clientreport;

import defpackage.fvl;
import defpackage.jul;
import defpackage.yq5;
import io.sentry.DataCategory;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.w;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final h f21697a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21698b;

    public e(@NotNull SentryOptions sentryOptions) {
        this.f21698b = sentryOptions;
    }

    @Override // io.sentry.clientreport.g
    public void a(@NotNull DiscardReason discardReason, @NotNull DataCategory dataCategory) {
        b(discardReason, dataCategory, 1L);
    }

    @Override // io.sentry.clientreport.g
    public void b(@NotNull DiscardReason discardReason, @NotNull DataCategory dataCategory, long j) {
        try {
            g(discardReason.getReason(), dataCategory.getCategory(), Long.valueOf(j));
        } catch (Throwable th) {
            this.f21698b.getLogger().b(SentryLevel.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.g
    public void c(@NotNull DiscardReason discardReason, @Nullable jul julVar) {
        if (julVar == null) {
            return;
        }
        try {
            Iterator<fvl> it = julVar.c().iterator();
            while (it.hasNext()) {
                e(discardReason, it.next());
            }
        } catch (Throwable th) {
            this.f21698b.getLogger().b(SentryLevel.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.g
    @NotNull
    public jul d(@NotNull jul julVar) {
        c cVarH = h();
        if (cVarH == null) {
            return julVar;
        }
        try {
            this.f21698b.getLogger().c(SentryLevel.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator<fvl> it = julVar.c().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            arrayList.add(fvl.x(this.f21698b.getSerializer(), cVarH));
            return new jul(julVar.b(), arrayList);
        } catch (Throwable th) {
            this.f21698b.getLogger().b(SentryLevel.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return julVar;
        }
    }

    @Override // io.sentry.clientreport.g
    public void e(@NotNull DiscardReason discardReason, @Nullable fvl fvlVar) {
        w wVarG;
        if (fvlVar == null) {
            return;
        }
        try {
            SentryItemType sentryItemTypeB = fvlVar.F().b();
            if (SentryItemType.ClientReport.equals(sentryItemTypeB)) {
                try {
                    i(fvlVar.D(this.f21698b.getSerializer()));
                } catch (Exception unused) {
                    this.f21698b.getLogger().c(SentryLevel.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                DataCategory dataCategoryF = f(sentryItemTypeB);
                if (dataCategoryF.equals(DataCategory.Transaction) && (wVarG = fvlVar.G(this.f21698b.getSerializer())) != null) {
                    g(discardReason.getReason(), DataCategory.Span.getCategory(), Long.valueOf(((long) wVarG.q0().size()) + 1));
                }
                g(discardReason.getReason(), dataCategoryF.getCategory(), 1L);
            }
        } catch (Throwable th) {
            this.f21698b.getLogger().b(SentryLevel.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    public final DataCategory f(SentryItemType sentryItemType) {
        if (SentryItemType.Event.equals(sentryItemType)) {
            return DataCategory.Error;
        }
        if (SentryItemType.Session.equals(sentryItemType)) {
            return DataCategory.Session;
        }
        if (SentryItemType.Transaction.equals(sentryItemType)) {
            return DataCategory.Transaction;
        }
        if (SentryItemType.UserFeedback.equals(sentryItemType)) {
            return DataCategory.UserReport;
        }
        if (SentryItemType.Profile.equals(sentryItemType)) {
            return DataCategory.Profile;
        }
        if (SentryItemType.Statsd.equals(sentryItemType)) {
            return DataCategory.MetricBucket;
        }
        if (SentryItemType.Attachment.equals(sentryItemType)) {
            return DataCategory.Attachment;
        }
        if (SentryItemType.CheckIn.equals(sentryItemType)) {
            return DataCategory.Monitor;
        }
        return SentryItemType.ReplayVideo.equals(sentryItemType) ? DataCategory.Replay : DataCategory.Default;
    }

    public final void g(@NotNull String str, @NotNull String str2, @NotNull Long l) {
        this.f21697a.a(new d(str, str2), l);
    }

    @Nullable
    public c h() {
        Date dateC = yq5.c();
        List<f> listB = this.f21697a.b();
        if (listB.isEmpty()) {
            return null;
        }
        return new c(dateC, listB);
    }

    public final void i(@Nullable c cVar) {
        if (cVar == null) {
            return;
        }
        for (f fVar : cVar.a()) {
            g(fVar.c(), fVar.a(), fVar.b());
        }
    }
}
