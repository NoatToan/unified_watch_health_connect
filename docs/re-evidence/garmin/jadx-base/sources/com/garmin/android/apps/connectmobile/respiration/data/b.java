package com.garmin.android.apps.connectmobile.respiration.data;

import d53.w;
import f12.l;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/respiration/data/b;", "Lcom/garmin/android/apps/connectmobile/respiration/data/a;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements com.garmin.android.apps.connectmobile.respiration.data.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41135b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f41136a;

    static {
        new a(null);
    }

    public b(l lVar) {
        lVar.getClass();
        this.f41136a = lVar;
    }

    @Override // com.garmin.android.apps.connectmobile.respiration.data.a
    public final List<ge1.c> a() {
        Object next;
        String strA4 = this.f41136a.A4("key_respiration_averages_selected_overlays", h0.k0(h0.b1(ge1.c.f77004f), ",", null, null, new ch1.f(12), 30));
        if (strA4 == null) {
            return j0.f134944a;
        }
        List<String> listW = w.W(strA4, new String[]{","});
        ArrayList arrayList = new ArrayList();
        for (String str : listW) {
            w13.c cVar = ge1.c.f77004f;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!s.g(((ge1.c) next).f77005a, str));
            ge1.c cVar2 = (ge1.c) next;
            if (cVar2 != null) {
                arrayList.add(cVar2);
            }
        }
        return arrayList;
    }

    @Override // com.garmin.android.apps.connectmobile.respiration.data.a
    public final void b(ArrayList arrayList) {
        this.f41136a.S("key_respiration_averages_selected_overlays", h0.k0(arrayList, ",", null, null, new ch1.f(11), 30));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/respiration/data/b$a;", "", "<init>", "()V", "", "USER_RESPIRATION_AVERAGES_SELECTED_OVERLAYS", "Ljava/lang/String;", "SEPARATOR", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
