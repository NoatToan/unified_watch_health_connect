package com.garmin.android.apps.connectmobile.segments.presentation;

import am.x0;
import am.y0;
import android.os.Bundle;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.r0;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/a;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends r0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f41418g = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public oc1.d f41419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f41420f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41421a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41421a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f41422a;

        public c(l lVar) {
            lVar.getClass();
            this.f41422a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f41422a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f41422a.invoke(obj);
        }
    }

    static {
        new C0785a(null);
    }

    public static boolean ma(bg1.a aVar) {
        if (aVar == null) {
            return false;
        }
        x0 x0VarJ = ((y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null)).j(aVar.f17839d);
        return x0VarJ == x0.f4308n || x0VarJ == x0.f4312o;
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public String fa() {
        return null;
    }

    public final void na(int i14, long j8) {
        try {
            bg1.b.C0257b c0257b = bg1.b.f17848m;
            String strValueOf = String.valueOf(j8);
            ArrayList arrayList = this.f41420f;
            List listB1 = arrayList != null ? h0.b1(arrayList) : null;
            if (listB1 == null) {
                listB1 = j0.f134944a;
            }
            c0257b.getClass();
            String strA = bg1.b.C0257b.a(strValueOf, listB1);
            oc1.d dVar = this.f41419e;
            dVar.getClass();
            xy2.b.K(dVar, new oc1.f(dVar, strA, null)).f(this, new c(new cg1.a(this, i14, j8)));
        } catch (JSONException e4) {
            i2.a.j(i2.f36769a, "AbstractGCMSegmentsSenderActivity", "putSegmentsInDownloadQueue: " + e4);
        }
    }

    public final void oa(ArrayList arrayList, boolean z14) {
        if (this.f41420f == null) {
            this.f41420f = new ArrayList();
        }
        if (z14) {
            ArrayList arrayList2 = this.f41420f;
            arrayList2.getClass();
            arrayList2.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bg1.a aVar = (bg1.a) it.next();
            if (ma(aVar)) {
                ArrayList arrayList3 = this.f41420f;
                arrayList3.getClass();
                arrayList3.add(aVar);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f41419e = (oc1.d) new x1(this).a(oc1.d.class);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
        if (bundle.containsKey("LIST_SENDABLE_SEGMENTS")) {
            this.f41420f = bundle.getParcelableArrayList("LIST_SENDABLE_SEGMENTS");
        }
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (this.f41420f != null) {
            bundle.putParcelableArrayList("LIST_SENDABLE_SEGMENTS", new ArrayList<>(this.f41420f));
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.segments.presentation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "LIST_PARCEL", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0785a {
        public /* synthetic */ C0785a(j jVar) {
            this();
        }

        private C0785a() {
        }
    }
}
