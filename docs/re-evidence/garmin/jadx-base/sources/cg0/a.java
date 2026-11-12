package cg0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import fg0.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v13.c;
import zf0.b0;
import zf0.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcg0/a;", "", "Lzf0/d;", "eventRepo", "<init>", "(Lzf0/d;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f27117a;

    /* JADX INFO: renamed from: cg0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0417a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27118a;

        static {
            int[] iArr = new int[dg0.a.values().length];
            try {
                iArr[dg0.a.PRIMARY_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dg0.a.SUPPORTING_EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27118a = iArr;
        }
    }

    public /* synthetic */ a(d dVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? d.a.a(d.f204343b) : dVar);
    }

    public static k a(k kVar, dg0.a aVar, boolean z14) {
        fg0.j jVar;
        fg0.j jVarB;
        kVar.getClass();
        aVar.getClass();
        fg0.j eventCustomization = kVar.getEventCustomization();
        if (eventCustomization == null) {
            jVar = new fg0.j(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        } else {
            jVar = eventCustomization;
        }
        int i14 = C0417a.f27118a[aVar.ordinal()];
        if (i14 == 1) {
            Boolean bool = Boolean.TRUE;
            jVarB = fg0.j.b(jVar, null, null, bool, bool, null, null, 8155);
        } else if (i14 != 2) {
            Boolean bool2 = Boolean.FALSE;
            jVarB = fg0.j.b(jVar, null, null, bool2, bool2, null, null, 7963);
            if (z14) {
                jVarB.I(null);
                jVarB.M(null);
            }
        } else {
            jVarB = fg0.j.b(jVar, null, null, Boolean.FALSE, Boolean.TRUE, null, null, 7963);
            if (z14) {
                jVarB.I(null);
                jVarB.M(null);
            }
        }
        return k.d(kVar, null, null, null, null, null, null, jVarB, -16777217);
    }

    public final Object b(k kVar, c cVar) {
        boolean zG = s.g(kVar.getEventOrganizer(), Boolean.TRUE);
        d dVar = this.f27117a;
        if (zG) {
            Long l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            l14.getClass();
            long jLongValue = l14.longValue();
            dVar.getClass();
            return f0.J(dVar, new b0(dVar, jLongValue, kVar, null), cVar);
        }
        if (kVar.getShareableEventUuid() == null) {
            return new v2.a(new IllegalStateException(), null, null, 6, null);
        }
        String shareableEventUuid = kVar.getShareableEventUuid();
        shareableEventUuid.getClass();
        fg0.j eventCustomization = kVar.getEventCustomization();
        eventCustomization.getClass();
        return dVar.i(shareableEventUuid, eventCustomization, cVar);
    }

    public a(d dVar) {
        dVar.getClass();
        this.f27117a = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
