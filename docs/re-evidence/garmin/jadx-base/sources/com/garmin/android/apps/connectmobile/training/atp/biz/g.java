package com.garmin.android.apps.connectmobile.training.atp.biz;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/g;", "Lcom/garmin/android/apps/connectmobile/training/atp/biz/h;", "", "trainingPlanId", "", "goal", "raceGoalTime", "language", "contentfulLanguage", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends h {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/g$a;", "Liu1/h;", "Lxw1/h;", "", "trainingPlanId", "", "goal", "raceGoalTime", "language", "Liu1/i;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Liu1/i;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends iu1.h<xw1.h> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f45154l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f45155m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Integer f45156n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final String f45157o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i14, String str, Integer num, String str2, iu1.i<? super xw1.h> iVar) {
            super(null, null, false, xw1.h.class, null, iVar, null, null, 215, null);
            str.getClass();
            str2.getClass();
            iVar.getClass();
            this.f45154l = i14;
            this.f45155m = str;
            this.f45156n = num;
            this.f45157o = str2;
        }

        @Override // iu1.h
        public final c83.d<String> f() {
            Integer num = this.f45156n;
            int iIntValue = num != null ? num.intValue() : 0;
            String str = this.f45157o;
            String str2 = this.f45155m;
            int i14 = this.f45154l;
            if (num == null || num.intValue() <= 0) {
                return ((gu1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, gu1.a.class, new c83.h.a[0], null, null, null, 120)).D(i14, str2, str);
            }
            return ((gu1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, gu1.a.class, new c83.h.a[0], null, null, null, 120)).z(i14, str2, iIntValue, str);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/biz/g$b", "Liu1/i;", "Lxw1/h;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements iu1.i<xw1.h> {
        public b() {
        }

        @Override // iu1.i
        public final void b(List<? extends xw1.h> list) {
            xw1.i contentfulModel;
            com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
            g gVar = g.this;
            gVar.i(eVar, list);
            List<xw1.h> list2 = (List) gVar.f50097g.get(eVar);
            ArrayList arrayList = new ArrayList();
            list2.getClass();
            for (xw1.h hVar : list2) {
                xw1.f coach = hVar.getCoach();
                String contentfulContentId = (coach == null || (contentfulModel = coach.getContentfulModel()) == null) ? null : contentfulModel.getContentfulContentId();
                if (contentfulContentId != null) {
                    fy1.i.f73924a.getClass();
                    arrayList.add(new xt1.c(new fu1.k("coaches", new fu1.c(contentfulContentId, fy1.i.a.e()).a(), null, 4, null), gVar.f45160m));
                }
                xw1.i iVar = hVar.getCom.google.android.exoplayer2.util.MimeTypes.BASE_TYPE_VIDEO java.lang.String();
                String contentfulContentId2 = iVar != null ? iVar.getContentfulContentId() : null;
                if (contentfulContentId2 != null) {
                    arrayList.add(new xt1.c(new fu1.k("videos", new fu1.f(contentfulContentId2, gVar.f45159l).a(), null, 4, null), gVar.f45161n));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            cw.e.b(gVar, arrayList);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i14, String str, Integer num, String str2, String str3, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(str3, aVar);
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new ArrayList());
        cw.e.a(this, new a(i14, str, num, str2, new b()));
    }
}
