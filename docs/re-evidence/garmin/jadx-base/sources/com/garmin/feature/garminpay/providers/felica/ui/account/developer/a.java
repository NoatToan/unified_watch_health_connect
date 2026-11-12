package com.garmin.feature.garminpay.providers.felica.ui.account.developer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.core.view.j;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import c83.a0;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.apps.connectmobile.util.gson.GCMEnumTypeAdapterFactory;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import e23.l;
import i83.k;
import i83.o;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import k23.d;
import ln2.e;
import o13.p;
import o13.u;
import okhttp3.ResponseBody;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import pn2.m;
import ps2.w;
import qn2.n;
import qn2.t;
import qn2.v;
import rd2.f;
import rn2.i;
import rn2.q;
import rn2.r;
import rn2.s;
import tn2.r0;
import vb.h;
import vn2.t0;
import wd.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/a;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f51027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f51028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f51029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f51030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<String> f51031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f51032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f51033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f51034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f51035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f51036j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<p<Boolean, String>> f51037k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0<u<Long, String, i>> f51038l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0<String> f51039m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f51040n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y0 f51041o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y0 f51042p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y0 f51043q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0 f51044r;

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.account.developer.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/a$a;", "Lmn2/b;", "actual", "Lkotlin/Function0;", "", "Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/a$b;", "mockStrategyProvider", "<init>", "(Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/a;Lmn2/b;Le23/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C1049a implements mn2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mn2.b f51045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<List<b>> f51046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f51047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f51048d;

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.account.developer.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class CallableC1050a<V> implements Callable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1049a f51050b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f51051c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f51052d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f51053e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ m f51054f;

            public CallableC1050a(C1049a c1049a, String str, String str2, String str3, m mVar) {
                this.f51050b = c1049a;
                this.f51051c = str;
                this.f51052d = str2;
                this.f51053e = str3;
                this.f51054f = mVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object next;
                Iterator<T> it = C1049a.this.f51046b.invoke().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((b) next) instanceof b.C1051a));
                b.C1051a c1051a = next instanceof b.C1051a ? (b.C1051a) next : null;
                if (c1051a == null) {
                    return this.f51050b.f51045a.l(this.f51051c, this.f51052d, this.f51053e, this.f51054f);
                }
                String str = c1051a.f51090a;
                if (r.class.isAssignableFrom(r.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new r(str, null))));
                }
                if (q.class.isAssignableFrom(r.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new q(str, null, null))));
                }
                if (rn2.p.class.isAssignableFrom(r.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new rn2.p(str, null, null))));
                }
                h.z(j.i(r.class, "Incorrect FNResponseDto<", ">"));
                return null;
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.account.developer.a$a$b */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class b<V> implements Callable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1049a f51056b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f51057c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f51058d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f51059e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ m f51060f;

            public b(C1049a c1049a, String str, String str2, String str3, m mVar) {
                this.f51056b = c1049a;
                this.f51057c = str;
                this.f51058d = str2;
                this.f51059e = str3;
                this.f51060f = mVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object next;
                Iterator<T> it = C1049a.this.f51046b.invoke().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((b) next) instanceof b.C1051a));
                b.C1051a c1051a = next instanceof b.C1051a ? (b.C1051a) next : null;
                if (c1051a == null) {
                    return this.f51056b.f51045a.r(this.f51057c, this.f51058d, this.f51059e, this.f51060f);
                }
                String str = c1051a.f51090a;
                if (r.class.isAssignableFrom(r.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new r(str, null))));
                }
                if (q.class.isAssignableFrom(r.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new q(str, null, null))));
                }
                if (rn2.p.class.isAssignableFrom(r.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new rn2.p(str, null, null))));
                }
                h.z(j.i(r.class, "Incorrect FNResponseDto<", ">"));
                return null;
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.account.developer.a$a$c */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c<V> implements Callable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1049a f51062b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f51063c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f51064d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f51065e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ m f51066f;

            public c(C1049a c1049a, String str, String str2, String str3, m mVar) {
                this.f51062b = c1049a;
                this.f51063c = str;
                this.f51064d = str2;
                this.f51065e = str3;
                this.f51066f = mVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object next;
                Iterator<T> it = C1049a.this.f51046b.invoke().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((b) next) instanceof b.C1051a));
                b.C1051a c1051a = next instanceof b.C1051a ? (b.C1051a) next : null;
                if (c1051a == null) {
                    return this.f51062b.f51045a.h(this.f51063c, this.f51064d, this.f51065e, this.f51066f);
                }
                String str = c1051a.f51090a;
                if (r.class.isAssignableFrom(r.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new r(str, null))));
                }
                if (q.class.isAssignableFrom(r.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new q(str, null, null))));
                }
                if (rn2.p.class.isAssignableFrom(r.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new rn2.p(str, null, null))));
                }
                h.z(j.i(r.class, "Incorrect FNResponseDto<", ">"));
                return null;
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.account.developer.a$a$d */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class d<V> implements Callable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1049a f51068b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f51069c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f51070d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ m f51071e;

            public d(C1049a c1049a, String str, String str2, m mVar) {
                this.f51068b = c1049a;
                this.f51069c = str;
                this.f51070d = str2;
                this.f51071e = mVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object next;
                Iterator<T> it = C1049a.this.f51046b.invoke().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((b) next) instanceof b.C1051a));
                b.C1051a c1051a = next instanceof b.C1051a ? (b.C1051a) next : null;
                if (c1051a == null) {
                    return this.f51068b.f51045a.f(this.f51069c, this.f51070d, this.f51071e);
                }
                String str = c1051a.f51090a;
                if (r.class.isAssignableFrom(r.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new r(str, null))));
                }
                if (q.class.isAssignableFrom(r.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new q(str, null, null))));
                }
                if (rn2.p.class.isAssignableFrom(r.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new rn2.p(str, null, null))));
                }
                h.z(j.i(r.class, "Incorrect FNResponseDto<", ">"));
                return null;
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.account.developer.a$a$e */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class e<V> implements Callable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1049a f51073b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f51074c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f51075d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f51076e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ m f51077f;

            public e(C1049a c1049a, String str, String str2, String str3, m mVar) {
                this.f51073b = c1049a;
                this.f51074c = str;
                this.f51075d = str2;
                this.f51076e = str3;
                this.f51077f = mVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object next;
                Iterator<T> it = C1049a.this.f51046b.invoke().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((b) next) instanceof b.C1051a));
                b.C1051a c1051a = next instanceof b.C1051a ? (b.C1051a) next : null;
                if (c1051a == null) {
                    return this.f51073b.f51045a.e(this.f51074c, this.f51075d, this.f51076e, this.f51077f);
                }
                String str = c1051a.f51090a;
                if (r.class.isAssignableFrom(rn2.p.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new r(str, null))));
                }
                if (q.class.isAssignableFrom(rn2.p.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new q(str, null, null))));
                }
                if (rn2.p.class.isAssignableFrom(rn2.p.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new rn2.p(str, null, null))));
                }
                h.z(j.i(rn2.p.class, "Incorrect FNResponseDto<", ">"));
                return null;
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.account.developer.a$a$f */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class f<V> implements Callable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1049a f51079b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f51080c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f51081d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f51082e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ m f51083f;

            public f(C1049a c1049a, String str, String str2, String str3, m mVar) {
                this.f51079b = c1049a;
                this.f51080c = str;
                this.f51081d = str2;
                this.f51082e = str3;
                this.f51083f = mVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object next;
                Iterator<T> it = C1049a.this.f51046b.invoke().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((b) next) instanceof b.C1051a));
                b.C1051a c1051a = next instanceof b.C1051a ? (b.C1051a) next : null;
                if (c1051a == null) {
                    return this.f51079b.f51045a.s(this.f51080c, this.f51081d, this.f51082e, this.f51083f);
                }
                String str = c1051a.f51090a;
                if (r.class.isAssignableFrom(q.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new r(str, null))));
                }
                if (q.class.isAssignableFrom(q.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new q(str, null, null))));
                }
                if (rn2.p.class.isAssignableFrom(q.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new rn2.p(str, null, null))));
                }
                h.z(j.i(q.class, "Incorrect FNResponseDto<", ">"));
                return null;
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.account.developer.a$a$g */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class g<V> implements Callable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1049a f51085b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f51086c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f51087d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f51088e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ m f51089f;

            public g(C1049a c1049a, String str, String str2, String str3, m mVar) {
                this.f51085b = c1049a;
                this.f51086c = str;
                this.f51087d = str2;
                this.f51088e = str3;
                this.f51089f = mVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object next;
                Iterator<T> it = C1049a.this.f51046b.invoke().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((b) next) instanceof b.C1051a));
                b.C1051a c1051a = next instanceof b.C1051a ? (b.C1051a) next : null;
                if (c1051a == null) {
                    return this.f51085b.f51045a.n(this.f51086c, this.f51087d, this.f51088e, this.f51089f);
                }
                String str = c1051a.f51090a;
                if (r.class.isAssignableFrom(q.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new r(str, null))));
                }
                if (q.class.isAssignableFrom(q.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new q(str, null, null))));
                }
                if (rn2.p.class.isAssignableFrom(q.class)) {
                    return q03.r.f(a0.b(new pn2.p(new s("0000", null, null, null, null), new rn2.p(str, null, null))));
                }
                h.z(j.i(q.class, "Incorrect FNResponseDto<", ">"));
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C1049a(a aVar, mn2.b bVar, e23.a<? extends List<? extends b>> aVar2) {
            bVar.getClass();
            aVar2.getClass();
            this.f51048d = aVar;
            this.f51045a = bVar;
            this.f51046b = aVar2;
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<rn2.e>>> a(String str, String str2, String str3, m<t, qn2.f> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            return u(v(this.f51045a.a(str, str2, str3, mVar)), "beginDeleteCard", ((t) mVar.b()).getOperationId());
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<rn2.e>>> b(String str, String str2, String str3, m<t, qn2.e> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            return u(v(this.f51045a.b(str, str2, str3, mVar)), "beginPermanentDeleteCard", ((t) mVar.b()).getOperationId());
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<rn2.j>>> c(String str, String str2, m<t, qn2.i> mVar) {
            str.getClass();
            str2.getClass();
            mVar.getClass();
            return u(this.f51045a.c(str, str2, mVar), "getCardList", ((t) mVar.b()).getOperationId());
        }

        @Override // mn2.b
        @k({"User-Agent: GarminPay App", "Content-Type: application/json", "Accept: application/pdf"})
        @o("/nfc-service/suica/getCardUsageHistory/{deviceId}/{seId}/{serviceId}")
        public final q03.r<a0<ResponseBody>> d(@i83.s("deviceId") String str, @i83.s("seId") String str2, @i83.s("serviceId") String str3, @i83.a m<t, qn2.f> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            return this.f51045a.d(str, str2, str3, mVar);
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<rn2.p>>> e(String str, String str2, String str3, m<t, rn2.e> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            e eVar = new e(this, str, str2, str3, mVar);
            int i14 = w03.b.f181178a;
            return u(new e13.b(eVar), "endIssueCard", null);
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<r>>> f(String str, String str2, m<t, rn2.e> mVar) {
            str.getClass();
            str2.getClass();
            mVar.getClass();
            d dVar = new d(this, str, str2, mVar);
            int i14 = w03.b.f181178a;
            return u(new e13.b(dVar), "endInitializeChip", null);
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<rn2.e>>> g(String str, String str2, String str3, m<t, qn2.e> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            return u(v(this.f51045a.g(str, str2, str3, mVar)), "beginAccessCard", ((t) mVar.b()).getOperationId());
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<r>>> h(String str, String str2, String str3, m<t, qn2.j> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            c cVar = new c(this, str, str2, str3, mVar);
            int i14 = w03.b.f181178a;
            return u(new e13.b(cVar), "endDeleteCardWithEmail", null);
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<rn2.b>>> i(String str, String str2, String str3, m<qn2.s, n> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            wn2.e eVar = new wn2.e(this, mVar, str, str2, str3);
            int i14 = w03.b.f181178a;
            return u(new e13.b(eVar), "getScript #" + ((n) mVar.d()).getSequenceNumber(), null);
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<rn2.m>>> j(String str, String str2, String str3, m<t, qn2.f> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            return u(this.f51045a.j(str, str2, str3, mVar), "getCardUsageHistory", ((t) mVar.b()).getOperationId());
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<pn2.d>>> k(String str, String str2, String str3, m<t, qn2.e> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            return u(this.f51045a.k(str, str2, str3, mVar), "updateCardInfo", ((t) mVar.b()).getOperationId());
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<r>>> l(String str, String str2, String str3, m<t, rn2.e> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            CallableC1050a callableC1050a = new CallableC1050a(this, str, str2, str3, mVar);
            int i14 = w03.b.f181178a;
            return u(new e13.b(callableC1050a), "endAccessCard", null);
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<rn2.e>>> m(String str, String str2, m<t, qn2.c> mVar) {
            str.getClass();
            str2.getClass();
            mVar.getClass();
            wn2.e eVar = new wn2.e(this.f51048d, this, str, str2, mVar);
            int i14 = w03.b.f181178a;
            return new e13.b(eVar);
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<q>>> n(String str, String str2, String str3, m<v, rn2.e> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            g gVar = new g(this, str, str2, str3, mVar);
            int i14 = w03.b.f181178a;
            return u(new e13.b(gVar), "endRecoverCard", null);
        }

        @Override // mn2.b
        @k({"User-Agent: GarminPay App", "Content-Type: application/json"})
        @i83.f("userprofile-service/userprofile/email")
        public final q03.r<a0<rn2.v>> o() {
            return this.f51045a.o();
        }

        @Override // mn2.b
        @k({"User-Agent: GarminPay App", "Content-Type: application/json"})
        @i83.f("/nfc-service/suica/customerInfo")
        public final q03.r<a0<pn2.t>> p() {
            return this.f51045a.p();
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<rn2.d>>> q(String str, String str2, String str3, m<t, qn2.f> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            return u(v(this.f51045a.q(str, str2, str3, mVar)), "beginRecoverCard", ((t) mVar.b()).getOperationId());
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<r>>> r(String str, String str2, String str3, m<t, rn2.e> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            b bVar = new b(this, str, str2, str3, mVar);
            int i14 = w03.b.f181178a;
            return u(new e13.b(bVar), "endDeleteCard", null);
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<q>>> s(String str, String str2, String str3, m<t, rn2.e> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            f fVar = new f(this, str, str2, str3, mVar);
            int i14 = w03.b.f181178a;
            return u(new e13.b(fVar), "endPermanentDeleteCard", null);
        }

        @Override // mn2.b
        public final q03.r<a0<pn2.p<rn2.c>>> t(String str, String str2, String str3, m<t, qn2.d> mVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            mVar.getClass();
            return u(v(this.f51045a.t(str, str2, str3, mVar)), "beginIssueCard", ((t) mVar.b()).getOperationId());
        }

        public final e13.e u(q03.r rVar, String str, String str2) {
            a aVar = this.f51048d;
            t0 t0Var = new t0(new wn2.f(str, aVar, str2), 17);
            rVar.getClass();
            int i14 = w03.b.f181178a;
            return new e13.e(new e13.g(rVar, t0Var), new t0(new w02.b(19, aVar, str), 18));
        }

        public final e13.f v(q03.r rVar) {
            t0 t0Var = new t0(new vu1.b(this, 18), 16);
            rVar.getClass();
            int i14 = w03.b.f181178a;
            return new e13.f(rVar, t0Var);
        }
    }

    public a() {
        y0<String> y0Var = new y0<>();
        this.f51031e = y0Var;
        this.f51032f = "CCC";
        this.f51033g = "DDD";
        y0<p<Boolean, String>> y0Var2 = new y0<>(new p(Boolean.FALSE, null));
        this.f51037k = y0Var2;
        y0<u<Long, String, i>> y0Var3 = new y0<>(new u(0L, "", null));
        this.f51038l = y0Var3;
        y0<String> y0Var4 = new y0<>();
        this.f51039m = y0Var4;
        this.f51040n = new c(this, 9);
        this.f51041o = y0Var;
        this.f51042p = y0Var2;
        this.f51043q = y0Var3;
        this.f51044r = y0Var4;
    }

    @SuppressLint({"CheckResult", "SetTextI18n"})
    public final void A4(Intent intent, wn2.c cVar) {
        cVar.getClass();
        p<Boolean, String> pVar = new p<>(Boolean.TRUE, "Preparing...");
        y0<p<Boolean, String>> y0Var = this.f51037k;
        y0Var.j(pVar);
        this.f51027a = intent.getLongExtra("extra.unit_id", -1L);
        String stringExtra = intent.getStringExtra("extra.device_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f51028b = stringExtra;
        tn2.c cVar2 = tn2.c.f165530a;
        p005kotlin.jvm.internal.t0 t0Var = s0.f105811a;
        d dVarB = t0Var.b(f.class);
        f fVarA = f.a();
        fVarA.getClass();
        cVar2.getClass();
        tn2.c.a(dVarB, fVarA);
        d dVarB2 = t0Var.b(es2.a.class);
        GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        bVar.getClass();
        tn2.c.a(dVarB2, GarminPayCoreDatabase.b.a(contextC).e());
        w wVar = w.f140538a;
        long j8 = this.f51027a;
        wVar.getClass();
        ps2.n nVarI = w.i(j8);
        nVarI.getClass();
        e eVar = e.f113687a;
        Gson gsonCreate = new GsonBuilder().registerTypeAdapterFactory(new GCMEnumTypeAdapterFactory()).registerTypeAdapterFactory(new GsonUtil.BundleTypeAdapterFactory()).setExclusionStrategies(new com.garmin.android.apps.connectmobile.util.gson.a()).create();
        gsonCreate.getClass();
        eVar.getClass();
        Object objB = e.b(gsonCreate).b(mn2.b.class);
        objB.getClass();
        this.f51030d = new r0(new tn2.w(nVarI.f140499b, nVarI.f140498a), new C1049a(this, (mn2.b) objB, cVar), null, null, null, 28, null);
        y0Var.j(new p<>(Boolean.FALSE, null));
        Long lValueOf = Long.valueOf(this.f51027a);
        String str = this.f51028b;
        if (str != null) {
            this.f51038l.j(new u<>(lValueOf, str, this.f51029c));
        } else {
            p005kotlin.jvm.internal.s.m("deviceName");
            throw null;
        }
    }

    public final Object x4(q03.b bVar, String str, l lVar, v13.i iVar) {
        Unit unit = Unit.INSTANCE;
        w03.b.a(unit, "completionValue is null");
        Object objY4 = y4(new z03.s(bVar, null, unit), str, lVar, iVar);
        return objY4 == u13.a.COROUTINE_SUSPENDED ? objY4 : unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object y4(q03.r rVar, String str, l lVar, v13.c cVar) {
        wn2.j jVar;
        p<Boolean, String> pVar;
        if (cVar instanceof wn2.j) {
            jVar = (wn2.j) cVar;
            int i14 = jVar.f186375e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f186375e = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new wn2.j(this, cVar);
            }
        } else {
            jVar = new wn2.j(this, cVar);
        }
        Object objE0 = jVar.f186373c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f186375e;
        y0<String> y0Var = this.f51039m;
        y0<p<Boolean, String>> y0Var2 = this.f51037k;
        try {
            if (i15 == 0) {
                o13.r.b(objE0);
                y0Var2.j(new p<>(Boolean.TRUE, "Executing " + str));
                y0Var.j(str + ": Started");
                x53.c cVar2 = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                wn2.k kVar = new wn2.k(rVar, null);
                jVar.f186371a = str;
                jVar.f186372b = lVar;
                jVar.f186375e = 1;
                objE0 = ge1.b.e0(bVar, kVar, jVar);
                if (objE0 == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lVar = jVar.f186372b;
                str = jVar.f186371a;
                o13.r.b(objE0);
            }
            y0Var.j(str + ": Success");
            lVar.invoke(objE0);
            pVar = new p<>(Boolean.FALSE, null);
        } catch (Throwable th3) {
            try {
                y0Var.j(str + ": Failed - " + th3.getClass().getSimpleName() + ": " + th3.getMessage());
                pVar = new p<>(Boolean.FALSE, null);
            } catch (Throwable th4) {
                y0Var2.j(new p<>(Boolean.FALSE, null));
                throw th4;
            }
        }
        y0Var2.j(pVar);
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/a$b;", "", "<init>", "()V", "c", "a", "b", "Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/a$b$a;", "Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/a$b$b;", "Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/a$b$c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.account.developer.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/a$b$a;", "Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/a$b;", "", "expectedResultCode", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1051a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f51090a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1051a(String str) {
                super(null);
                str.getClass();
                this.f51090a = str;
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.felica.ui.account.developer.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/a$b$b;", "Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/a$b;", "", "sequenceNumber", "", "expectedResultCode", "occurrence", "<init>", "(ILjava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1052b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f51091a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f51092b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f51093c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1052b(int i14, String str, int i15) {
                super(null);
                str.getClass();
                this.f51091a = i14;
                this.f51092b = str;
                this.f51093c = i15;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/a$b$c;", "Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f51094a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
